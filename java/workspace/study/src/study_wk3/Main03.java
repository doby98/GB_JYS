package study_wk3;

/*
 * 상속 문제!
 * 
 * 부모 클래스인 Game 클래스를 생성한다.
 * Game 클래스는 
 * gameName(게임이름), gameProduction(제작사), gamePlayer(한 판당 최대 인원)
 * 을 멤버변수로 갖는다.
 * 
 * 그리고, Game 클래스를 상속받는 "본인이 좋아하는 게임이름" 클래스를 만들고,
 * 해당 게임의 특징을 멤버변수로 갖는 자식 클래스 두 개를 생성한다.
 * 
 * JavaBeans와 toString을 이용하여 main메서드에서 해당 게임의 정보를 출력하시오!
 * 
 * 게임의 특징 ex) 게임 장르, 게임의 캐릭터 수, 한 판 당 걸리는 시간 등,,
 * 
 */

public class Main03 {

	public static void main(String[] args) {
		
		Leagueoflegend lol = new Leagueoflegend();
		
		lol.setGameName("롤");
		lol.setGameProduction("라이엇 게임즈");
		lol.setGamePlayer(10);
		lol.setChampion("진");
		
		System.out.println( lol.toString() );
		
		System.out.println("--------------------------------------");
		
		Fifa fifa = new Fifa();
		
		fifa.setGameName("피파온라인4");
		fifa.setGameProduction("넥슨");
		fifa.setGamePlayer(2);
		fifa.setLeft_score(3);
		fifa.setRight_score(2);
		
		System.out.println( fifa.toString() );
		
	}

}
