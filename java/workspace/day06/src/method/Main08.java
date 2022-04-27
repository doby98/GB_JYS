package method;

/*
 * 문제 4. 반환값이 있고, 받는 인자값이 있는 메서드를 구현해보세요.
 */

public class Main08 {

	public static void main(String[] args) {
		
		boolean adult = age(18);
		System.out.println("Are you adult? : " + adult);
		
		System.out.println( plusM(10, 20));
		System.out.println( plusM(10, 30));
		System.out.println( plusM(10, 40));
		System.out.println( plusM(10, 50));
	}
	
	public static boolean age( int x ) {
		if (x > 19) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int plusM( int a, int b) {
		return a + b;
	}

}
