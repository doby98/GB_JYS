package study_0313;

/*
 *  피보나치 수열
 *  피보나치 수열이란? 
 *  1,1,2,3,5,8,13,21,34,55,... 과 같이
 *  1,1로 시작해서 앞의 두항의 합이 뒤의 항으로 이루어진 수열입니다.
 *  
 *  문제 : 파라미터로 총 항의 수(n)를 받고, 입력한 총 항을 차례대로 출력하는 메소드를 만들어 보세요!
 *  
 *  예) fibonacci(10) 
 *    출력결과 ->  1 1 2 3 5 8 13 21 34 55 (한 항씩 줄바꿈으로 출력)
 *    		   
 */

public class JYS_Fibonacci {

	public static void main(String[] args) {
		fibo(15);
		
	}
	
	public static void fibo(int n) {
		int f1 = 1;
		int f2 = 1;
		int fn = 0;
		
		System.out.print("피보나치 수열 " + n + " : ");
		System.out.print(f1 + " ");
		System.out.print(f2 + " ");
		for( int i = 0; i < n - 2; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
			System.out.print(fn + " ");
		}
	}

}
