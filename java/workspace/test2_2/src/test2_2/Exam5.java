package test2_2;

public class Exam5 {

	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum_odd = 0;
		int sum_even = 0;
		
		for( int i = 0; i < num.length; i++ ) {
			if( num[i] % 2 == 0 ) {
				sum_even += num[i];
			} else {
				sum_odd += num[i];
			}
		}
		System.out.println("짝수 : " + sum_even);
		System.out.println("홀수 : " + sum_odd);
	}
}
