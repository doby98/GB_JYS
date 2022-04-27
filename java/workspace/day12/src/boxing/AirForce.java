package boxing;

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >>> 이륙 ");
		System.out.println(this.getName() + " >>> 공중폭격 실행 ");
	}

	public void bombing() {
		System.out.println(
				this.getName() + " >>> 폭격 ");
	}
}
