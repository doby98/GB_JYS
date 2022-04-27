package study_wk4;

// this 키워드를 통한 생성자 Overload

// Book 클래스의 생성자를 통해 내가 읽었던 좋은 책들을 공유하기!

// 파라미터를 책 제목, 저자, 읽은 년도 모두 가지는 생성자를 기준으로 
// 책 제목, 저자만 입력 받는 생성자, 책 제목만 입력 받는 생성자를 추가로 만들고, this 키워드를 통하여 생성자를 완성한다.
// toString을 통해 책 소개를 출력하는 메서드를 만들기!

public class Book {
	private String title;	// 책 제목
	private String writer;	// 저자
	private int year;		// 읽은 년도
	
	public Book(String title, String writer, int year) {
		super();
		this.title = title;
		this.writer = writer;
		this.year = year;
	}
	 
	public Book(String title, String writer) {
		this(title, writer, 1998);
	}
	
	public Book(String title) {
		this(title, "전래동화", 2002);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// 수요일 문제
	public void explain() {
		System.out.println(this.title + "은(는) 내용입니다!");
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", year=" + year + "]";
	}
	
}
