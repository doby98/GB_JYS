package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article art = new Article(1, "깃허브", "깃허브 사용법", "유섭", 5301, "2022. 03. 17.");
		
		System.out.println(art.getSeq());
		System.out.println(art.getSubject());
		System.out.println(art.getContent());
		System.out.println(art.getWriter());
		System.out.println(art.getHit());
		System.out.println(art.getRegDate());
		
	}

}
