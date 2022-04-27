package study_wk3;

/*
 * 여행을 떠나 봅시다!
 * 
 * 여행을 가고싶은 장소(place), 경비(money) 
 * 그리고 코로나 상황(covid)를 멤버변수로 가지는 Travel 클래스가 부모 클래스입니다.
 * 
 * 부모 클래스의 생성자는 장소와 경비를 파라미터로 갖습니다!
 * 
 * 부모 클래스에서, traveling() 메서드를 생성하고, 
 * 이를 자식 클래스에서 Override 하여 가고 싶은 여행지를 출력해 줄거에요!
 *   
 * 여행 장소 두 곳을 자식 클래스로 생성해주세요! 
 * 이 때, 자식 클래스에서 getter, setter를 통해 covid 상황을 업데이트 할 것이며, 
 * 만약, covid가 true라면 traveling() 메서드에서 여행을 못간다는 문구만 출력되게 해주세요!
 * 
 * 마지막으로 각 여행지에서 갈 만한 관광지를 추천해주는 메서드를 자식 클래스에서 생성해주시고, 출력해주세요!
 */

public class Travel {
	private String place;
	private int money;
	private boolean covid19;
			
	public Travel(String place, int money) {
		super();
		this.place = place;
		this.money = money;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isCovid19() {
		return covid19;
	}

	public void setCovid19(boolean covid19) {
		this.covid19 = covid19;
	}

	// Override 해주세요!
	public void traveling() {
		System.out.println(this.place + "로 여행가자! " + this.money + "달러 챙겨");
	}
}
