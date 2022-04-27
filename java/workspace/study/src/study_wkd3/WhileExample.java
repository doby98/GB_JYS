package study_wkd3;

// while문 예제입니다.

/*
 *  방적식 6x + 3y = 24의 모든 해를 구하시오.
    (단, x와 y는 정수이고 각각의 범위는 0 <= x <= 10, 0 <= y <= 10이다.)
 */

public class WhileExample {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
//		for( x = 0; x <= 4; x++ ) {
//			for( y = 0; y <= 8; y++) {
//				if( 6*x + 3*y == 24) {
//					System.out.println("방정식의 해 : (" + x + "," + y + ")" );
//				}
//			}
//		}
		
		while( x < 5 ) {
			while( y < 9 ) {
				if( 6*x + 3*y == 24) {
					System.out.println("방정식의 해 : (" + x + "," + y + ")" );	
			
				}
				
				y++;
			}
			
			y = 0;
			x++;
		}
		
	}

}
