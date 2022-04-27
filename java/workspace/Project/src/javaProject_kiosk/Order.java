package javaProject_kiosk;

import java.util.Random;
import java.util.Scanner;

public class Order extends Kiosk {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	int num = 0;
	
	private int waitting = r.nextInt();
	private int[] menu_count = new int[3];
	private int[] menu_price = {2500, 300, 1000};
	private String[] menu = {"햄버거", "콜라", "감자튀김"};
	private int price = 0;
	private int money = 0;
		
	public String shopping() {
		String shopping_basket = " ";
		
		for( int i = 0; i < menu.length; i++ ) {
			shopping_basket += "<" + menu[i] + " : " + menu_count[i] + "개" + "> ";
		}
		
		return shopping_basket;
	}

	
	
	@Override
	public void orderMenu() {		
		while( !isFlag() ) {
			System.out.println();
			System.out.println("주문을 진행해주시기 바랍니다.");
			System.out.println("1. 햄버거(2,500원) / 2. 콜라(300원) / 3. 감자튀김(1,000원) / 4. 결제하기");
			num = sc.nextInt();
			
			switch (num) {
			
			case 1:
				System.out.println("햄버거를 추가하셨습니다.");
				
				this.menu_count[0] += 1;
				System.out.println("장바구니 : " +this.shopping());
				break;
				
			case 2:
				System.out.println("콜라를 추가하셨습니다.");
				this.menu_count[1] += 1;
				System.out.print("장바구니 : " + this.shopping());			
				break;
				
			case 3:
				System.out.println("감자튀김을 추가하셨습니다.");
				this.menu_count[2] += 1;
				System.out.print("장바구니 : " + this.shopping());
				break;
				
			case 4:
				
				System.out.println("1. 포장 / 2. 매장");
				int place = sc.nextInt();
				
				if( place == 1 ) {
					System.out.println("대기번호는" + this.waitting + "번 입니다.");
				} else {
					System.out.println("바로 준비해드리겠습니다.");
				}
				
				for( int i = 0; i < menu.length; i++ ) {
					price += menu_price[i] * menu_count[i]; 
				}
				
				System.out.println("계산을 진행합니다.");
				System.out.println();
				System.out.println("총 금액은 " + price + "원 입니다.");
				System.out.println("돈을 지불해주세요. >> ");
				System.out.println();
				
				money = sc.nextInt();
				
				if( money >= price ) {
					System.out.println("결제완료 되었습니다.");
					System.out.println(money - price + "원이 반환되었습니다.");
					this.setFlag(true);
					
				} else {
					System.out.println("금액이 부족합니다.");
					break;
				}
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
				break;				
			}						
		}
	}
}
