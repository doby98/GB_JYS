package Java1;

public class parkjonghwi {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		
		int sum1 = 0;
		
		for (int i = 1; i <= 10; i += 2) {
			sum1 += i;
			//System.out.println(sum1);
			//System.out.println(i);
		}
		System.out.println(sum1);
		
		System.out.println("-------------------");
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		
		int sum2 = 0;
		
		int i = 2;
		
		while(i <= 10) {
			sum2 += i;
			i += 2;
			//System.out.println(sum2);
			//System.out.println(i);
		}
		System.out.println(sum2);
		
		System.out.println("-------------------");
		
		/*
		 * 문제 3.
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		
		
		
		/*
		 * 문제 4. 
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		
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
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
		
		// 2중 for문
		int m = 0;
		
		for(int k = 2; k < 10; k++) {
			System.out.println("---------------");
			for (int j = 1; j < 10; j++) {
				m = k * j;
				System.out.println(k + " * " + j + " = " + m);
			}
		}
		
		System.out.println("---------------");
		
		// 2중 while문
		int c = 0;
		int b = 1;
		int a = 2;
		
		while(a < 10) {
			System.out.println("---------------");
			a++;
		} while(b < 10) {
			b++;
			c = a * b;
			System.out.println(a + " * " + b + " = " + c);
		}
		
	}

}
