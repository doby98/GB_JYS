package test3;

// 1. Calc 클래스를 생성한다.
public class Calc {
	
	// 2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.
	private String str1;

	public Calc(String str1) {
		super();
		this.str1 = str1;
	}
	
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	// 3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.
	public int plus( int x, int y ) {
		return x + y;
	}
	
	// 4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.
	public int minus( int x, int y ) {
		return x - y;
	}
	
	// 5. int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.
	public int times( int x, int y ) {
		return x * y;
	}
	
	// 6. int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다.
	public int divide( int x, int y ) {
		return x / y;
	}
	
}
