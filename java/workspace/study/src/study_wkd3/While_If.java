package study_wkd3;

import java.util.Scanner;

/* while 문제 (if도 같이 사용해야 합니다)
 *
 * 하나의 숫자를 입력받아 2와 3의 배수가 아니면
 * 계속 while문을 돌고
 * 2와 3의 배수이면 프로그램 종료하기
 *
 */

public class While_If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//    	boolean flag = true;
    	
    	while (true) {
    		System.out.println("숫자 입력 >>");
    	   	int num = sc.nextInt(); // 하나의 정수 입력
    	   	
    		if(num % 2 == 0 && num % 3 == 0 && num != 0) {
    			System.out.println("프로그램 종료!");
    			break;
    		}
    	}
    	
    	sc.close();
	}

}
