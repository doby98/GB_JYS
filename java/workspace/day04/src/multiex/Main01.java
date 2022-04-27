package multiex;

public class Main01 {

	public static void main(String[] args) {
		int target = 99;
		
		if (target == 100) {
			int num = target + 100;
			System.out.println("num : " + num);
		} else {
			int num = target - 100;
			System.out.println("num : " + num);
		}
		
		int num = 105;			// if문을 벗어났으므로 int num 선언 가능
		System.out.println(num);	
	}

}
