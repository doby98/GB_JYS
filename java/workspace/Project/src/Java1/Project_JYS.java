package Java1;

public class Project_JYS {

	public static void main(String[] args) {
		// 결과 맞추는 것에 초점!
		
		// 문제 1. 1 ~ 10까지 홀수 값의 합
		
		System.out.println("문제 1. 1 ~ 10까지 홀수 값의 합");
		int sum_o = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum_o += i;
			}
		}
		
//		int result = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			if(i % 2 == 1) {	// 홀수인 조건
//				result += i;
//			}	
//		}
		
		System.out.println("홀수 sum : " + sum_o);
		
//		System.out.println("1 ~ 10까지 홀수 값의 합 : " + result);
		
		System.out.println("--------------------------------------");
		
		// 문제 2. 1 ~ 10까지 짝수 값의 합
		
		System.out.println("문제 2. 1 ~ 10까지 짝수 값의 합");
		
		int sum_e = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {	// 짝수인 조건
				sum_e += i;
			}
		}
		
		System.out.println("짝수 sum : " + sum_e);
		
		System.out.println("--------------------------------------");
		
		// 문제 3.
		/*
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 * ★★★★★★★★★★
		 */
		
		System.out.println("문제 3. 별 출력(1)");
		
		int line_1 = 10;
		
		for (int i = 0; i < line_1; i++) {
			for (int j = 0; j < line_1; j++) {
				System.out.print("★");		// 줄바꿈 없이 출력
			}
			
			System.out.println();			// 줄바꿈 입력
		}
		
		System.out.println("--------------------------------------");
		
		// 문제 4.
		/*
		 * ★★★★★★★★★★
		 * ★★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★
		 * ★★★★★★
		 * ★★★★★
		 * ★★★★
		 * ★★★
		 * ★★
		 * ★
		 */
		
		System.out.println("문제 4. 별 출력(2)");
		
		int line_2 = 10;
		
//		for (int i = 0; i < line_2; i++) {
//			for (int j = line_2 - i; j > 0; j--) {
//				System.out.print("★");
//			}
//			
//			System.out.println();
//		}
		
		for (int i = 0; i < line_2; i++) {
			for (int j = i; j < line_2; j++) {
				System.out.print("★");
			}
			
			System.out.println("");
		}
		
		System.out.println("--------------------------------------");
		
		
		// 문제 5.
		/*
		 * ★
		 * ★★
		 * ★★★
		 * ★★★★
		 * ★★★★★
		 * ★★★★★★
		 * ★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★★
		 * ★★★★★★★★★★
		 */
		
		System.out.println("문제 5. 별 출력(3)");
		
		int line_3 = 10;
		
//		for (int i = 0; i < line_3; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("★");
//			}
//			
//			System.out.println();
//		}
		
		for (int i = line_3; i > 0; i--) {
			for (int j = i; j <= line_3; j++) {
				System.out.print("★");
			}
			
			System.out.println("");
		}
		
		System.out.println("--------------------------------------");
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
		
		System.out.println("문제 6. 구구단");
		System.out.println();
		System.out.println("for문");
		
		int start = 2;
		int end = 9;
		int sol1;
		
		for (int i = start; i <= end; i++) {
			System.out.println("[구구단 " + i + "단]");			
			for (int j = 1; j <= 9; j++) {
				sol1 = i * j;		// 차이점
				System.out.println(i + " X " + j + " = " + sol1);
			}
			
			System.out.println();
		}
				  
		System.out.println("--------------------------------------");
		
		System.out.println("while문");
		
		int i = 2;		
		int max = 9;
		int j = 1;
		int sol2 = 0;
		
		while (i <= max) {
			System.out.println("[구구단 " + i + "단]");
			j = 1;		// 아래 j에 대한 while문 밖에만 있으면 된다!
			
			while (j <= max) {
				sol2 = i * j;		// 차이점
				System.out.println(i + " X " + j + " = " + sol2);
				j++;
			}
			
			i++;
			System.out.println();
		}
		
	}

}
