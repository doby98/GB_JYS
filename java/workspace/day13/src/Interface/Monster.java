package Interface;

public class Monster implements Fight, Move {
	private String name;
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {	// 걷기
		System.out.println(this.name + " >> 어슬렁거리기");
	}

	@Override
	public void run() {		// 뛰기
		System.out.println(this.name + " >> 도망가기");
	}

	@Override
	public void jump() {	// 점프
		System.out.println(this.name + " >> 점프로 피하기");
	}

	@Override
	public void attack() {	// 공격
		System.out.println(this.name + " >> 공격하기");
	}

	@Override
	public void shield() {	// 방어
		System.out.println(this.name + " >> 방어막");
	}

}
