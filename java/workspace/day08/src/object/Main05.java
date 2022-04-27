package object;

class Article {
	int seq;		// 글 번호
	String subject;	// 글 제목
	String writer;	// 작성자
	
	/*
	 *  파라미터가 존재하는 생성자
	 *  모든 전역변수(멤버변수)를 초기화
	 */
	
	public Article( int seq, String subject, String writer ) {
//		System.out.println("파라미터 생성자 호출");
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	
	public void info() {
//		System.out.println("info() 메서드 호출");
		System.out.println("글 번호 : " + this.seq);
		System.out.println("글 제목 : " + this.subject);
		System.out.println("글 작성자 : " + this.writer);
	}
	
}

public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article art1 = new Article(10, "비트코인 떡상", "유섭");
		art1.info();
		
		System.out.println("-------------------------");
		
		// Article 객체 2번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article art2 = new Article(22, "우크라이나 종전!", "Hope");
		art2.info();
	}

}
