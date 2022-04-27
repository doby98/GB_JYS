package test1;

public class Exam2 {

	public static void main(String[] args) {
		int sum = 0;		// 단순 누적합
		int total_sum = 0;	// 단순 누적합의 누적합
		
		for( int i = 1; i < 11; i++ ) {
			sum += i;
			total_sum += sum;
		}
		
		System.out.println("누적 총합 : " + total_sum);
		
	}

}
