package study_wk4;

public class Detective extends Book {
	private String name = "셜록 홈즈";
	
	public Detective(String title) {
		super(title);
	}
	
	@Override
	public void explain() {
		System.out.println(this.getTitle() + "은(는) 사건에 대해 추리하는 내용입니다.");
	}
	
	public void homes() {
		System.out.println(this.getTitle() + "의 대표작은 " + this.name + "입니다.");
	}
	
}
