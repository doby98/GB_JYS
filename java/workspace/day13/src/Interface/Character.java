package Interface;

public class Character implements Action, Fight, Move {
	private String name;	
	
	public Character(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {	// 걷기
		System.out.println(this.name + " >> 인간의 걸음");
	}

	@Override
	public void run() {		// 뛰기
		System.out.println(this.name + " >> 전속력 달리기");
	}

	@Override	
	public void jump() {	// 점프
		System.out.println(this.name + " >> 귀여운 점프");
	}

	@Override
	public void attack() {	// 공격
		System.out.println(this.name + " >> 기본 공격");
	}

	@Override
	public void shield() {	// 방어
		System.out.println(this.name + " >> 방어막 전개");
	}

	@Override
	public void pickup() {	// 줍기
		System.out.println(this.name + " >> 아이템 줍기");
	}

}
