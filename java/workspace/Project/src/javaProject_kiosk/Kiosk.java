package javaProject_kiosk;

import java.util.Scanner;

public class Kiosk {
	Scanner sc = new Scanner(System.in);
	
	private boolean flag = false;
//	private int waitting = 1;
	final private int PASSWORD = 981022;
	private boolean start = true;
	
//	private int[] menu_count = new int[4];
//	private String[] shopping_basket = {"햄버거", "콜라", "감자튀김"};
	
	public boolean isFlag() {
		return flag;
	}
	
	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public void orderMenu() {
		
		while( !isFlag() ) {
			System.out.println("비밀번호를 입력해주세요 >> ");
			int num = sc.nextInt();
			
			if( num == PASSWORD ) {
				System.out.println("비밀번호가 일치합니다.");
				this.setFlag(true);
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
			System.out.println();
		}
	}
	
	
}
