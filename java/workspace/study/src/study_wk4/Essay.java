package study_wk4;

public class Essay extends Book {
	private String name = "참 소중한 너라서";
	
	public Essay(String title) {
		super(title);
	}
	
	@Override
	public void explain() {
		System.out.println(this.getTitle() + "은(는) 저자의 삶이 녹아있는 작품입니다.");
	}
	
	public void you() {
		System.out.println(this.getTitle() + "의 대표작은 " + this.name + "입니다.");
	}

}
