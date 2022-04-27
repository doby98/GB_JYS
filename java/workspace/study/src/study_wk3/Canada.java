package study_wk3;

public class Canada extends Travel {

	public Canada(String place, int money) {
		super(place, money);
	}
	
	@Override
	public void traveling() {
		
		if( this.isCovid19() == true ) {
			System.out.println("코로나 상황이 안좋아 못갑니다.");
		} else {
			super.traveling();
			System.out.println("코로나 끝났다 가자!");
		}
		
	}
	
	public void emotion() {
		System.out.println(this.getPlace() + "퀘벡이 진짜 이쁘대ㅠㅠ");
	}
	
}
