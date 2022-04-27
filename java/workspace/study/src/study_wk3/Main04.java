package study_wk3;

public class Main04 {

	public static void main(String[] args) {
		
		England eng = new England("영국", 3000000);
		eng.setCovid19(true);
		eng.traveling();
		eng.soccer();
		
		System.out.println("---------------------------");
		
		Canada can = new Canada("캐나다", 5000000);
		can.setCovid19(false);
		can.traveling();
		can.emotion();
			
	}

}

