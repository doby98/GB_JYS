package exception;

public class Main03 {

	public static void main(String[] args) {
		
		try {
			String year2 = "뭘까";
			int age2 = 200 - Integer.parseInt(year2) + 1;
			System.out.println(age2);
		} catch( NumberFormatException e ) {	// 적당한 예외문구를 입력해야 예외처리가 실행된다!
			System.out.println( "에러가 발생했습니다." );
			System.out.println( " 원인 : " + e.getMessage() );
			e.printStackTrace();
		} 										
		
		System.out.println("----------- 프로그램 종료 -----------");
		
	}

}
