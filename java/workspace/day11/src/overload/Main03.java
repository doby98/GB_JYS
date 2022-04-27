package overload;

public class Main03 {

	public static void main(String[] args) {
		// 생성자가 여러 가지 형태로 Overload 되어 있기 때문에
		// 객체를 생성하는 방법이 다양해졌다.
		
		Member m1 = new Member();
		Member m2 = new Member(25);
		Member m3 = new Member("개발자");
		Member m4 = new Member("멋쟁이토마토", 7);
		
		System.out.println( m1.toString() );
		System.out.println( m2.toString() );
		System.out.println( m3.toString() );
		System.out.println( m4.toString() );

	}

}
