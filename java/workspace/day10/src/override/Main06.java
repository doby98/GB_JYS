package override;

public class Main06 {

	public static void main(String[] args) {
		Army a = new Army("육군");
//		a.setName("유섭");
		a.attack();
		a.tank();
		
		System.out.println("-----------------------");
		
		Navy n = new Navy("해군");
		n.attack();
		n.nucleus();
		
		System.out.println("-----------------------");
		
		AirForce air = new AirForce("공군");
		air.attack();
		air.bombing();
		
	}

}
