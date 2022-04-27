package study_wkd3;

// for문 예제입니다.

/* 
 *  두 개의 주사위를 던졌을 때, 눈의 합이 8이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
 */

public class ForExample {

	public static void main(String[] args) {
		
		for( int i = 2; i <= 6; i++ ) {
			for( int j = 2; j <= 6; j++ ) {
				if( i + j == 8 ) {
					System.out.println("주사위의 합이 8 : " + i + ", " + j);
				}
			}
		}		
	}
}
