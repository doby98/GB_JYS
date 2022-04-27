package study_wk4;

public class Main01 {

	public static void main(String[] args) {
		Book b1 = new Book("참 소중한 너라서", "김지훈", 2018);
		System.out.println(b1);
		
		Book b2 = new Book("셜록 홈즈", "코난 도일");
		System.out.println(b2.toString());
		
		Book b3 = new Book("홍길동전");
		System.out.println(b3);
		
	}

}
