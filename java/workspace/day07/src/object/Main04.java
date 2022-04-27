package object;

public class Main04 {

	public static void main(String[] args) {
		// 객체 생성
		Calc cal = new Calc();
		
		// plus
		int p = cal.plus(100, 50);
		System.out.println("100 + 50 = " + p);
		
		// minus
		System.out.println("100 - 50 = " + cal.minus(100, 50));
		
		// times
		System.out.println("100 * 50 = " + cal.times(100, 50));
		
		// divide
		System.out.println("100 / 50 = " + cal.divide(3.14F, 4.1F));
		
		// remainder
		System.out.println(cal.remainder(48, 7));
		
	}

}

class Calc {
	// plus 메서드, param int x, int y, return 		-> 덧셈
	int plus( int x, int y ) {
		return x + y;
	}
	
	// minus 메서드, param int x, int y, return		-> 뺄셈
	int minus( int x, int y ) {
		return x - y;
	}
	
	// times 메서드, param int x, int y, return		-> 곱셈
	int times( int x, int y ) {
		return x * y;
	}
	
	// divide 메서드, param int x, int y, return		-> 나눗셈(몫)
	float divide( float x, float y ) {
		float result = 0;
		
		if( y != 0 ) {
			result = x / y;
		}
		
		return result;
	}
	
	// remainder 메서드, param int x, int y, return	-> 나눗셈(나머지)
	int remainder( int x, int y) {
		return x % y; 
	}
}
