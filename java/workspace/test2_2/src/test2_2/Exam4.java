package test2_2;

public class Exam4 {
	
	public static void main(String[] args) {
		int[] num = {94, 85, 95, 88, 90};
		int max = 0;
		
		for( int i = 0; i < num.length; i++ ) {
			if( max < num[i] ) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}
