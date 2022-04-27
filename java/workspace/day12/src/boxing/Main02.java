package boxing;

public class Main02 {

	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군1호");
		units[1] = new AirForce("공군2호");
		units[2] = new Navy("해군1호");
		units[3] = new Army("육군1호");
		units[4] = new Army("육군2호");
		
		// 부대 일괄 공격 attack();
				
		for( int i = 0; i < units.length; i++ ) {
			units[i].attack();
//			System.out.println("================");
			
			// 각 기능의 고유한 기능 호출
			if( units[i] instanceof Army ) {
				Army army = (Army)units[i];
				army.tank();
				System.out.println("공격완료");
			} else if( units[i] instanceof Navy ) {
				Navy navy = (Navy)units[i];
				navy.nucleus();
				System.out.println("공격완료");
			} else if( units[i] instanceof AirForce ) {
				AirForce af = (AirForce)units[i];
				af.bombing();
				System.out.println("공격완료");
			}
			System.out.println("================");
		}		
	}
}
