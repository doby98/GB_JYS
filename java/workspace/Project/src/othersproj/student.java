package othersproj;


// 학생관리 시작------------------------------------

public class student {
	
	
	// 초기화
	private String name;		// 나이 
	private int studentNum;		// 학번
	private String major;		// 전공
	private String phone;			// 번호
	
	public student(String name, int studentNum, String major, String phone) {
		super();
		this.name = name;
		this.studentNum = studentNum;
		this.major = major;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Date [name=" + name 
				+ ", studentNum=" + studentNum 
				+ ", major=" + major 
				+ ", phone=" + phone + "]";
	}
	
	

}
