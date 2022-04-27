package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체 생성
		StudentJava2 stdj = new StudentJava2();
				
		// setter 임의의 데이터 세팅, name, age 모두
		stdj.setName("유도비");
		stdj.setAge(23);
				
		// getter 출력, name, age 모두
		String name = stdj.getName();
		int age = stdj.getAge();
				
		System.out.println(name);
		System.out.println(age);	
	}

}
