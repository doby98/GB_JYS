package study_wk4;

public class Action extends Book {
	private String name = "나혼렙";
	
	public Action(String title) {
		super(title);
	}
	
	@Override
	public void explain() {
		System.out.println(this.getTitle() + "은(는) 무협이나 싸움을 소재로 한 내용입니다.");
	}
	
	public void levUp() {
		System.out.println(this.getTitle() + "의 대표작은 " + this.name + "입니다.");
	}

}
