package test2_2;

public class Exam3 {
	
	public static void main(String[] args) {
		 // 큰 금액의 동전을 우선적으로 거슬러 줘야한다

	    int[] coinUnit = { 500, 100, 50, 10 };

	    int money = 2680;

	    System.out.println("money=" + money);

	    for( int i = 0; i < coinUnit.length; i++ ) {
	    	System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i]);	// money를 각 동전 금액으로 나눈 몫
	        money %= coinUnit[i];		// money를 동전 금액으로 나눈 나머지 금액을 다시 할당
	    }
	

    }
}
