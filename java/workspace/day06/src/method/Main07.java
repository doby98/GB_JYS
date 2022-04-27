package method;

/*
 * 문제 3. 반환값이 있고, 받는 인자값이 없는 메서드를 구현하세요
 */

public class Main07 {

	public static void main(String[] args) {
		
		String name = prod();
		System.out.println(name);
	}
	
	public static String prod() {
		String produce = "안녕 나는 유섭이야!ㅠ";
		return produce;
	}

}
