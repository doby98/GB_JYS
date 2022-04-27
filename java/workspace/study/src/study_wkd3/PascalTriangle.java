package study_wkd3;

/*
 * 문제) 파스칼삼각형을 출력하는 프로그램 작성. 파스칼삼각형은 첫번째 줄 첫번째 행은 x로 초기화한후
 *      다음줄부터 바로 위 값과 바로 왼쪽의 값을 더한 값이 적용됨. (n행n열 배열로 풀이) 
 *      출처: https://moalgong.tistory.com/11 
 * 
 * 		그림 참고! (1행 1열의 수와, 배열의 크기는 여러분이 정해주세요!)
 * 
 */

public class PascalTriangle {

	public static void main(String[] args) {
		
		int x = 1;
		int line = 7;
		
		int[][] pascal = new int[line][line];
		
		for( int i = 0; i < pascal.length; i++) {
			for( int j = 0; j <= i; j++) {
				if( j == 0 || i == j ) {
					pascal[i][j] = x;
				} else {
					pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
				}
				
				System.out.printf("%02d ", pascal[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
