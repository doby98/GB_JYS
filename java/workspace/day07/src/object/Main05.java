package object;

public class Main05 {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("자바학생", "독서");
		
	}

}

class User {
	String subject;
	int age;
	String hobby;
	
	public void setName( String name, String hobby ) {
		System.out.println( name );
		subject = "국비지원";		// this는 전역변수만을 가리킬 수 있다.
		this.age = 25;
		this.hobby = hobby;
		System.out.println( "과목 : " + this.subject + ", 나이 : " + this.age 
				+ ", 취미 : " + this.hobby );
	}
	
}
