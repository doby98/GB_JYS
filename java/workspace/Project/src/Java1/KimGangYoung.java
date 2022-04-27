package Java1;

public class KimGangYoung {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int sum = 0;
		for( int a = 1; a <= 10; ++a ) {
			if(a%2 == 1) {
			sum += a;
				}
		}
	
		System.out.println(sum);
		System.out.println("------------------------------");
		

		// 문제2. 1 ~ 10 까지 짝수 값의 합
				
		int sum1 = 0;
		for( int a = 0; a <= 10; a+= 2) {
			sum1 += a;
			
		}
		System.out.println(sum1);
		System.out.println("------------------------------");
		
		/*
		 * 문제3.
		 * ★★★★★★★★
		   ★★★★★★★★
		   ★★★★★★★★
		   ★★★★★★★★
		   ★★★★★★★★
		   ★★★★★★★★
		   ★★★★★★★★
		 */
	//
	for(int i = 1; i < 9; i++) {
		for(int j = 1 ; j < 8; j++) {
			System.out.print("★");
		
		}
		System.out.println();
	}System.out.println("------------------------------");
		/*
		 * 문제4.
		 * ★★★★★★★★
		   ★★★★★★★
		   ★★★★★★
		   ★★★★★
		   ★★★★
		   ★★★
		   ★★
		   ★
		 */
	for(int x = 0; x < 9; x++) {
		for(int y = 0; y < 8 - x; y++) {
			System.out.print("★");
			
		}
		System.out.println();
	}
	System.out.println("--------------------------------");
		
		/*
		 * 문제 5.
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
	for(int a = 9; a > 0; a--) {
		for( int b = 8; b > 0 + a; b--) {
			System.out.print("★");
		}
		System.out.println();
	}
	System.out.println("--------------------------------");
		
		/*
		 * 문제6. 2단 ~ 9단까지 구구단 출력
		 * 				2중 for문, 2중 while문
		 */
		
		// 2중for문
	
		for( int a = 2; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				int c = a * b; 
				System.out.println(a + "*" + b + "=" + c);
			}
			System.out.println("");
		}
		
		
		System.out.println("-----------------------------");
		
		// 2중 while문(변수 2개)
	
		int a = 2; // 단수 지정.
		int b = 1; // 곱해질 수 지정.
		while ( a < 10 ) {
			// 단수를 2~9단까지 범위설정
		while ( b < 10 ) {
			// 단에 곱해질 수 범위 설정
		System.out.println(a + "*" + b + "=" + (a*b));
		b++;
		}
		b = 1;
		a++;
		System.out.println();
		}
		System.out.println("-----------------------------");
		
		// 2중 while문(변수 3개)
		
		int i = 2;
		int j = 1;
		int k = 0;
		while ( i < 10 ) {
		
		while ( j < 10 ) {
			k = i * j;
			System.out.println(i + "*" + j + "=" + k);
			j++;
		}
			j = 1;
			i++;
			System.out.println();
		}
		
	}
}