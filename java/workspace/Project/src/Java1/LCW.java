package Java1;

public class LCW {

	public static void main(String[] args) {
		// 반복문 예제

		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int sum1 = 0;
		for (int i = 1; i <= 10; i = i + 2) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		System.out.println("----------------------------");

		// 문제2. 1 ~ 10 까지 짝수 값의 합
		int sum2 = 0;
		for (int i = 0; i <= 10; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		System.out.println("----------------------------");

		/*
		 * 문제 3. ★★★★★★★★ ★★★★★★★★ ★★★★★★★★ ★★★★★★★★ ★★★★★★★★ ★★★★★★★★ ★★★★★★★★ ★★★★★★★★
		 */
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------------------");

		/*
		 * 문제 4. ★★★★★★★★ ★★★★★★★ ★★★★★★ ★★★★★ ★★★★ ★★★ ★★ ★
		 */
		for (int i = 0; i < 8; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------------------");

		/*
		 * 문제 5. ★ ★★ ★★★ ★★★★ ★★★★★ ★★★★★★ ★★★★★★★ ★★★★★★★★
		 */
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------------------");

		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능) 2중 for문, 2중 while문
		 */
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (j * i));
			}
			System.out.println();
		}

		int i = 2, j = 1;
		while (i <= 9) {
			System.out.println(i + "단");			
			while (j <= 9) {
				System.out.println(i + " x " + j + " = " + (i * j));
				j++;
			}
			System.out.println();
			j = 1;
			i++;

		}

	}

}
