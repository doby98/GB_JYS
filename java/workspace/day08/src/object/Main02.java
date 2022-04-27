package object;

class Member {
	String name;
	int age;
	
	// getName(), return, 전역변수 name
	public String getName() {
		return this.name;
	}
	
	// setName(), param name, 전역변수 name = param name
	public void setName( String name ) {
		this.name = name;
	}
	
	// getAge(), return, 전역변수 age
	public int getAge() {
		return this.age;
	}
 	
	// setAge(), param age, 전역변수 age = param age
	public void setAge( int age ) {
		this.age = age;
	}
	
	// say(), getName(), getAge() 각각 출력
	public void say() {
		System.out.println(this.getName());	// this는 메서드에서 안쓰는게 낫다.
		System.out.println(getAge());
	}
}

public class Main02 {

	public static void main(String[] args) {
		// Member class 객체 생성
		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		// say() 메서드 호출
		
		Member mm = new Member();
		mm.setName("유섭");
		mm.setAge(25);
		mm.say();
		
		mm.setName("DB학생");
		mm.setAge(28);
		mm.say();
			
	}

}
