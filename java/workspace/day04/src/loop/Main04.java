package loop;

public class Main04 {

	public static void main(String[] args) {
		// while문으로 구구단 7단 출력
		int mult = 0;
		
		// 초기값
		int j = 1;
		
		while (j < 10) {
			mult = 7 * j;
			System.out.println("구구단 7단 : " + mult);
			j++;
		}
		
	}

}
