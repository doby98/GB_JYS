package hiding;

public class Member {

	private String name;
	private int age;
	
	/*
	 * param name, age 생성자.
	 * 전역변수.name = name, 전역변수.age = age
	 */
	
	
	// getter, setter 만들기! (마우스 오른쪽 -> source -> getter, setter Geneate
	
	public Member( String name, int age ) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * 전역변수 name, age의 getter, setter 생성
	 */
	
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getAge() {
//		return this.age;
//	}
//	
//	public void setName( String name ) {
//		this.name = name;
//	}
//	
//	public void setAge( int age ) {
//		this.age = age;
//	}
	
	
	
}
