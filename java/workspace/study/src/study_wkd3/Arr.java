package study_wkd3;

// arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.

public class Arr {

	public static void main(String[] args) {
		int[][] arr = { 				
			{ 5, 5, 5, 5, 5 }, 
			{ 10, 10, 10, 10, 10 }, 
			{ 20, 20, 20, 20, 20 }, 
			{ 30, 30, 30, 30, 30 } 			
		};
		
		float sum = 0;
		float divided = arr.length * arr[0].length;

		for( int i = 0; i < arr.length; i++) {
			for( int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println("배열의 총합 : " + sum);
		System.out.println("배열의 평균 : " + sum / divided);
		
	}
	
	

}
