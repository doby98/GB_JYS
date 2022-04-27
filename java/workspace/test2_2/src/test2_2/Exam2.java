package test2_2;

public class Exam2 {
	
	public static void main(String[] args) {
		int[][] arr = { 
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;		// 합을 저장하는 변수
//		int average = 0;
		int count = 0;		// 배열의 요소들의 갯수를 count
		
		for( int i = 0; i < arr.length; i++ ) {
			for( int j = 0; j < arr[i].length; j++ ) {
				total += arr[i][j];
				count++;
			}
		}
		
		System.out.println("total=" + total);
		System.out.println("average=" + total/count);
		
	}
}
