package javaProject_kiosk;

import java.util.Scanner;

public class KoiskM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Kiosk kiosk = new Kiosk();
		Order order = new Order();
		int mode;
		
		while( kiosk.isStart() ) {
						
			System.out.println("모드를 정해주십시오.");
			System.out.println("1. 주문하기 / 2. 관리자메뉴");
			mode = sc.nextInt();
			
			switch (mode) {
			case 1:
				order.orderMenu();
				order.setFlag(false);
				break;
				
			case 2:
				kiosk.orderMenu();
				break;
				
			case 3:
				System.out.println("키오스크를 종료합니다.");
				kiosk.setStart(false);
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다. 재입력 바랍니다.");			
			}
		
		}		
		sc.close();		
	}
}
