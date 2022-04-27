package Java1;

public class CHH {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("홀수의 합 : " + sum);
		System.out.println("----------------------------------------");
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		int sum2 = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		
		System.out.println("짝수의 합 : " + sum2);
		System.out.println("----------------------------------------");
		
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
		String star = "";
		int width = 8;
		int height = 8;
		
		for(int j = 1; j <= width; j++) {     	// 별의 갯수 (길이)
			star += "★";
		}
		
		for(int i = 1; i <= height; i++) {   	// 높이
			System.out.println(star);
		}

		
		System.out.println("----------------------------------------");
		
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
		
		String star2 = "";
		int height2 = 8;
		
		for (int i = 1; i <= height2; i++) {			// 높이만큼 반복
			for (int j = 0; j <= height2 - i; j++) {	// 반복할 때 마다 별 갯수가 한개씩 줄어들기
				star2 += "★";							
			}											
			System.out.println(star2);
			star2 = "";		// 별 초기화
		}
		
		
		
		System.out.println("----------------------------------------");
		
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
		
		String star3 = "";
		int height3 = 8;
		
		for (int i = 1; i <= height3; i++) {		// 높이만큼 별이 1개씩 증가
			star3 += "★";
			System.out.println(star3);
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
		
		// for문
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		// while문
		int i = 1;
		int j = 1;
		
		while(i < 10) {
			while(j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			j = 1;	// j 초기화
			i++;
			System.out.println();
		}
		
		
		
	}

}
