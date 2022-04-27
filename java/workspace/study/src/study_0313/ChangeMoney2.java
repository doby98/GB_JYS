package study_0313;

/*
 * 거스름돈
 * 문제 : 지불한 금액을 나타내는 파라미터1, 물건의 가격을 나타내는 파라미터2
 * 		이렇게 두 개의 파라미터를 받아 가작 적은 수의 지폐를 거슬러 주는 메소드를 만들어 주세요.
 * 		(단위는 50000, 10000, 5000, 1000 원입니다.)
 * 
 * 예) change(100000, 23000);
 * 	출력결과 -> 50000원 지폐 : 1장
 * 		 	 10000원 지폐 : 2장 
 * 			  5000원	지폐 : 1장
 * 			  1000원 지폐 : 2장
 */	

public class ChangeMoney2 {

	public static void main(String[] args) {
		change(100000, 8900);
		
	}
	
	public static void change(int pay, int price) {
		int gold = 0;	// 50,000원 지폐의 갯수
		int green = 0;	// 10,000원 지폐의 갯수
		int bronze = 0;	// 5,000원 지폐의 갯수
		int blue = 0;	// 1,000원 지폐의 갯수
		
		int change = pay - price;
		
		gold = change / 50000;
		change %= 50000;
		
		green = change / 10000;
		change %= 10000;
		
		bronze = change / 5000;
		change %= 5000;
		
		blue = change / 1000;
		change %= 1000;
		
		System.out.println("잔액 : " + change + "원");
		System.out.println("50,000원 지폐 : " + gold + "장");
		System.out.println("10,000원 지폐 : " + green + "장");
		System.out.println("5,000원 지폐 : " + bronze + "장");
		System.out.println("1,000원 지폐 : " + blue + "장");
	}
}
