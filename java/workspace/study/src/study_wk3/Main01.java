package study_wk3;

/*
 * 내 핸드폰 기종과 내가 가지고 싶은 핸드폰의 기종 소개하기!
 * 
 * 1. 멤버 변수는 제조사, 핸드폰 기종, 가격이다.
 * 
 * 2. 파라미터가 존재하는 생성자를 통해 모든 멤버변수를 초기화하고,
 * 
 * 3. 멤버변수를 출력하는 메서드를 작성해준다.
 * 
 * 4. 객체를 두 개 생성하여, 내 핸드폰 기종과 가지고 싶은 핸드폰의 기종을 모두 소개(출력)하는 알고리즘을 만들어라
 */

class Phone {
	String production;
	String phoneType;
	int price;
	
	Phone( String production, String phoneType, int price ) {
		this.production = production;
		this.phoneType = phoneType;
		this.price = price;
	}
	
	public void introduce() {
		System.out.println("제조사 : " + this.production);
		System.out.println("기종 : " + this.phoneType);
		System.out.println("가격 : " + this.price);
	}
}

public class Main01 {

	public static void main(String[] args) {
		// 객체 생성
		Phone phone = new Phone("Sansung", "갤럭시 A90", 480000);
		phone.introduce();
		
		System.out.println("-------------------------");
		
		Phone phone2 = new Phone("Apple", "아이폰13", 1200000);
		phone2.introduce();
	
	}

}
