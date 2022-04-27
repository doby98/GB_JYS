package loop;

public class Main06 {

	public static void main(String[] args) {
		// do ~ while문으로 구구단 7단 출력
		int mult = 0;
		
		// 초기값
		int num = 1;
		
		do {
			mult = 7 * num;
			System.out.println("구구단 7단 : " + mult);
			num++;	// 한 줄 위여도 가능!
		} while (num < 10);
		
	}

}
