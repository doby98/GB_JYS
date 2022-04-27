package study_wk4;

/* 
 * 문제!
 * 
 * 1. 화요일에 만든 Book 클래스를 바탕으로, 책들의 장르를 이름으로 가지는 자식 클래스 3개를 생성한다.
 * 
 * 2. Book 클래스에 책의 내용을 설명하는 메서드를 만들고, 
 *    자식 클래스에서는 해당 메서드를 Override하여 해당 장르에 대해 설명하는 메서드를 구현하라!
 *    
 * 3. 또한 각 자식 클래스는 해당 장르의 대표작을 소개하는 단독 메서드를 구현하여야 한다.
 * 
 * 4. 마지막으로 해당 Main문에서 Book에 대한 객체 배열을 생성하고,
 *    해당 배열에 자식 클래스의 객체들을 할당한 후, 공통된 메서드를 실행시키고
 *    다시 instanceof를 통한 명시적 형변환을 거쳐 각 객체의 단독 메서드를 실행하시오 
 */

public class Main02 {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		
		books[0] = new Detective("추리 소설 1");
		books[1] = new Detective("추리 소설 2");
		books[2] = new Action("액션 소설 1");
		books[3] = new Action("액션 소설 2");
		books[4] = new Essay("에세이 1");
		
		for( int i = 0; i < books.length; i++ ) {
			books[i].explain();
			
			if( books[i] instanceof Detective ) {
				Detective det = (Detective)books[i];
				det.homes();
			} else if( books[i] instanceof Action ) {
				Action ac = (Action)books[i];
				ac.levUp();
			} else {
				Essay e = (Essay)books[i];
				e.you();
			}
			System.out.println("--------------------");
		}
		
		
		
	}

}
