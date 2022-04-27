package Interface;

public class Main01 {

	public static void main(String[] args) {
		
		Character cha = new Character("전사");
		Monster mon = new Monster("슬라임");
		
		cha.attack();
		cha.shield();
		cha.walk();
		cha.run();
		cha.jump();
		cha.pickup();
		
		System.out.println("--------------------");
		
		mon.attack();
		mon.shield();
		mon.walk();
		mon.run();
		mon.jump();
				
	}

}
