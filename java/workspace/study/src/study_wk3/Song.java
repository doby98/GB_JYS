package study_wk3;

/*
 * 노래 추천해주기!
 * 
 * 문제 : 노래를 추천해주는 Song 클래스를 생성하여라
 * 
 * 조건.  	
 * 1. Song 클래스의 멤버변수는 title(제목), artist(가수), year(발표년도)이다.
 * 2. 노래 정보를 출력하는 show() 메서드를 이용하고, 메서드는 Song의 멤버변수를 파라미터로 가진다.
 * 3. 클래스와 클래스의 메서드를 통해 main 메서드에서 세 곡의 노래를 추천해주세요!
 * (세 곡의 노래를 출력할 때, 객체를 세 개 생성해주시면 됩니다!)
 */

public class Song {

	public static void main(String[] args) {
		Song1 s1 = new Song1();
		Song1 s2 = new Song1();
		Song1 s3 = new Song1();
	
		s1.show("호랑수월가", "탑현", 2022);
		s1.introduce();
//		System.out.println(s1.title);
		
		s2.show("밤하늘의 별을", "경서", 2020);
		s2.introduce();
		
		s3.show("서랍", "10cm", 2021);
		s3.introduce();
	
	}

}

class Song1 {
	String title;
	String artist;
	int year;
	
	public void show( String title, String artist, int year ) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	public void introduce() {
		System.out.println("제목 : " + title + ", 가수 : " + artist + ", 발표년도 : " + year);
	}
	
}
