package overload;

public class Main04 {

	public static void main(String[] args) {
		Article art1 = new Article(1, "첫 번째 게시물", "자바학생");
		System.out.println(art1.toString());
		
		Article art2 = new Article(2, "자바학생2");
		System.out.println(art2);
		
		Article art3 = new Article(3);
		System.out.println(art3);
						
	}

}
