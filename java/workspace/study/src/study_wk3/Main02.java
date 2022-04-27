package study_wk3;

/*
 * 내 지역과 생일 소개하기!
 * 
 * 1. 내가 살고 있는 지역과 내 생일(월, 일)을 은닉된 멤버변수로 갖는다.
 * 
 * 2. getter 메서드 3개, setter 메서드 3개를 작성해 멤버변수에 값을 넣고, 읽는 메서드를 만들어라.
 * 
 * 3. main 메서드에서 객체를 생성하고 getter와 setter 메서드를 이용해 1. 의 내용을 출력하시오.
 * 
 */

class Yooseop {
	private String area;
	private int month;
	private int date;
	
	public String getArea() {
		return this.area;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public void setArea( String area ) {
		this.area = area;
	}
	
	public void setMonth( int month ) {
		this.month = month;
	}
	
	public void setDate( int date ) {
		this.date = date;
	}
	
	Yooseop( String area ) {
		this.area = area;
	}
}

public class Main02 {

	public static void main(String[] args) {
		Yooseop ys = new Yooseop("서울");
		
//		ys.setArea("의정부");
		ys.setMonth(10);
		ys.setDate(22);
		
		System.out.println("지역 : " + ys.getArea());
		System.out.println("월 : " + ys.getMonth());
		System.out.println("일 : " + ys.getDate());
		
	
	}

}
