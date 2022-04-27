package hiding;

public class Main02 {

	public static void main(String[] args) {
		// Member 클래스 객체생성
		Member m1 = new Member("섭섭", 23);
		
		// name, age 각각 출력
		
		System.out.println("이름 : " + m1.getName());
		System.out.println("나이 : " + m1.getAge());
		
		System.out.println("------------------------");
		
		m1.setName("자바스터디");
		m1.setAge(9);
		
		System.out.println("이름 : " + m1.getName());
		System.out.println("나이 : " + m1.getAge());
		
		

	}

}
