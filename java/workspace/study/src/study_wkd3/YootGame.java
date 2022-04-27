package study_wkd3;

/*
 * 윳놀이 게임을 만듦! (if문과 배열 이용)
 * 코드업 1207번 문제
 * 
 * 1. 윷이 각각 1개, 2개, 3개, 4개가 뒤집어진 상태를 '도', '개', '걸', '윷'
 * 2. 하나도 뒤집어 지지 않은 상태를 '모' 라고 한다.
 * 3. 4개의 윷의 상태가 배열로 주어지면 도, 개, 걸, 윷, 모 를 출력하는 프로그램을 작성하시오!
 * 		( 윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태 )
 */

public class YootGame {

	public static void main(String[] args) {
		
		int[] yoot = new int[] {0, 1, -1, 0};
		int count = 0;
		String result = "";
		
		for( int i = 0; i < yoot.length; i++ ) {
			if( yoot[i] == 1 ) {
				count++;
			} else if( yoot[i] == -1 ) {
				count -= 10;
			}			
		} 
		
		if( count > -10 && count < -5) {
			count += 11;
		} else if( count == -10) {
			count += 9;
		}
		
		switch( count ) {
		case 4:
			result = "윷";
			break;
	
		case 3:
			result = "걸";
			break;
		
		case 2:
			result = "개";
			break;
			
		case 1:
			result = "도";
			break;
			
		case 0:
			result = "모";
			break;
			
		case -1:
			result = "빽도";
			break;
		}
		
		System.out.println(result);
		
	
	
	}

}
