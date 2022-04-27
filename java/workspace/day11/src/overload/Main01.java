package overload;

public class Main01 {

	public static void main(String[] args) {
//		System.out.println();	// 출력문도 오버로딩
		
		Character c = new Character();		
		System.out.println( c.toString() );
		
		c.setProperty(19);
		System.out.println( c.toString() );
		
		c.setProperty("회사원");
		System.out.println( c.toString() );
		
		c.setProperty("자영업자", 20);
		System.out.println( c.toString() );
		
		c.setProperty(35, "교수");
		System.out.println( c.toString() );				
	}

}
