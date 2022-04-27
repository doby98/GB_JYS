package othersproj;

// 부모, 정보저장소

//운동기록프로그램
/*
* 필요한것.
* 1. 메인화면에서 버튼 카테고리생성
* 2. 입력받을 버튼에관한 메서드 구성
* 3. 입력 및 삭제가능하기위해 생성자활용?
* 4.
* 최초 화면에서 이름을 받는다. > 받은 이름은 이동할때마다 ㅇㅇ님을 붙여가며 이동한다 > 운동종목을고른다 > 횟수를 고른다. > 저장한다. 
*
* 
* 
*/

public class Mune_list {
	
	private	String name;	 // 회원이름
	private	String pone;	 // 날짜
	private	int age;		 // 회원번호
	private String helth;	 // 운동종류
	private String number;	 // 운동횟수
	

	// 변수들의 잠금해제
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPone() {
		return pone;
	}

	public void setPone(String pone) {
		this.pone = pone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHelth() {
		return helth;
	}

	public void setHelth(String helth) {
		this.helth = helth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}; 
}


	
























	












	
	