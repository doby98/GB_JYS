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

public class JYS_ChangeMoney2 {

	public static void main(String[] args) {
		change(100000, 23500);
		
	}
	
	public static void change(int pay, int price) {
		
		int[] bills = {50000, 10000, 5000, 1000};
		int change = pay - price;
		int count = 0;
		
		for( int i = 0; i < bills.length; i++) {
			int bill = bills[i];
			count = change / bill;
			
			System.out.println(bill + "원 지폐 : " + count + "장");
			change %= bill;
		}
		
		System.out.println("잔액 : " + change + "원");
	}
}
