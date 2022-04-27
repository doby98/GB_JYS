package study_wk3;

public class Leagueoflegend extends Game {
	private String champion;

	public String getChampion() {
		return champion;
	}

	public void setChampion(String champion) {
		this.champion = champion;
	}
	
	public String toString() {
		return ("게임 소개 [게임 이름 : " + getGameName() + ", 게임 제작사 : " + getGameProduction() + 
				", 게임 인원 수 : " + getGamePlayer() + ", 챔피언 : " + getChampion() + "]");
	}
}
