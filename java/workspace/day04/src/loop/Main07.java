package loop;

public class Main07 {

	public static void main(String[] args) {
		int max = 100;
		
		while (max > 100) {
			System.out.println("while문");
		}
		
		do {
			System.out.println("do ~ while문");
		} while (max > 100);		// do {} 안의 문장이 최초 1회 실행된다.
		
	}

}
