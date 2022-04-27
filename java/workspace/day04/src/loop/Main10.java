package loop;

public class Main10 {

	public static void main(String[] args) {
		// for문
		
		// 문제 1. 1 ~ 50까지 숫자의 합
		
		System.out.println("문제 1. 1 ~ 50까지 숫자의 합");
		
		int sum = 0;
		
		for (int i = 0; i <= 50; i++) {
			sum += i;
		}
		
		System.out.println("sum : " + sum);
		
		System.out.println("------------------------------------");
		
		// 문제 2. 구구단 2단
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 2 * 4 = 8
		// 2 * 5 = 10
		// 2 * 6 = 12
		// 2 * 7 = 14
		// 2 * 8 = 16
		// 2 * 9 = 18
		
		System.out.println("문제 2. 구구단 8단");
		
		int mult = 0;
		int mul_num = 8;
		
		for (int i = 1; i < 10; i++) {
			mult = mul_num * i;
			System.out.println(mul_num + " * " + i + " = " + mult);
		}
		
		System.out.println("------------------------------------");
		
		// while문
		
		// 문제 1. 10번 찍어 안넘어 가는 나무 없다.
		// 나무를 1번 찍었습니다.
		// 나무를 2번 찍었습니다.
		// ...
		// 나무를 10번 찍었습니다.
		// 나무가 넘어갑니다.
		
		System.out.println("문제 1. 10번 찍어 안넘어 가는 나무 없다.");
		
		int count = 1;
		
		while (count <= 10) {
			System.out.println("나무를 " + count + "번 찍었습니다.");
			count++;
			
			if (count > 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
		
//		System.out.println("나무가 넘어갑니다.");
		
		
	}

}
