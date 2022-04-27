package Java1;

public class K_S_W {
	public static void main(String[] args) {
		// 문제 1. 1 ~ 10 까지 홀수 값의 합
		int sum1 = 0;
		for(int num = 1; num < 11; num++) {
			if(num %2 == 1) {
				sum1 += num;
			}
		}
		System.out.println(sum1);
		
		System.out.println("--------------------------");
		// 문제 2. 1 ~ 10 까지 짝수 값의 합
		
		int sum2 = 0;
		for(int num = 1; num < 11; num++) {
			if(num %2 == 0) {
				sum2 += num;
			}
		}
		System.out.println(sum2);
		
		System.out.println("--------------------------");
		/*
		 * 문제 3.
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * 
		 */
		for(int i = 1; i < 9; i++) {
			System.out.println("★★★★★★★★");
		}
		
		
		
		System.out.println("--------------------------");
		/*
		 * 문제 4.
		 * ★★★★★★★★
		 * ★★★★★★★
		 * ★★★★★★
		 * ★★★★★
		 * ★★★★
		 * ★★★
		 * ★★
		 * ★
		 */
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8-i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
		
		System.out.println("--------------------------");
		/*
		 * 문제 5.
		 * ★
		 * ★★
		 * ★★★
		 * ★★★★
		 * ★★★★★
		 * ★★★★★★
		 * ★★★★★★★
		 * ★★★★★★★★
		 */
		for(int i = 0; i < 8; i++ ) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------------");
		/*
		 * 문제 6. 2단 ~ 9단 구구단 출력
		 * 	2중 for문, 2wnd while문
		 */
		
		System.out.println("2중 for문");
		for(int a = 1; a < 9; a++) {
			for(int b = 1; b < 10; b++) {
				int dan = a+1;
				System.out.println(dan + " X " + b + " = " + dan*b);
			}
			System.out.println("");
		}
		
		
		System.out.println("--------------------------");
		System.out.println("2중 while문");
		int a = 1, b = 1;
		
		while(a<9) {
			a++;
			while(b < 10) {
				System.out.println(a + " X " + b + " = " + a*b );
				b++;	
			}
			System.out.println("");
			b=1;
		}
		
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		
		
		
		
		
		
		
	}
}
