package study_0313;

/*
 * 팩토리얼
 * 팩토리얼이란?
 * 기호는 n!로 나타내며 1부터 어떤 양의 정수 n까지의 정수를 모두 곱한것을 말한다.
 * 팩토리얼 예시) 2! -> 1 * 2 = 2 , 5! -> 1 * 2 * 3 * 4 * 5 = 120
 *  
 *  문제 : 파라미터로 양의 정수 n을 받고 n!을 계산해서 리턴해주는 메소드를 만들어 보세요!
 *  	(주의! : 0!은 1입니다. System.out.println(factorial(0)); -> 1 출력)
 *  
 *  예) System.out.println(factorial(6));
 *  	출력결과 -> 720
 */

public class JYS_Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		
		
	}
	
	public static int factorial(int x) {
		int fac = 1;
		
		if (x == 0) {
			return 1;
		} else {
			for( int i = 1; i <= x; i++) {
				fac *= i;
			}
			return fac;
		}
	}

}
