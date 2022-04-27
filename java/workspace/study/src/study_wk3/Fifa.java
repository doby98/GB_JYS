package study_wk3;

public class Fifa extends Game {
	private int left_score;
	private int right_score;	
	
	public int getLeft_score() {
		return left_score;
	}

	public void setLeft_score(int left_score) {
		this.left_score = left_score;
	}

	public int getRight_score() {
		return right_score;
	}

	public void setRight_score(int right_score) {
		this.right_score = right_score;
	}

	public String toString() {
		return ("게임 소개 [ 게임 이름 : " + getGameName() + ", 게임 제작사 : " + getGameProduction() + 
				", 게임 인원 수 : " + getGamePlayer() + ", 스코어 : " + getLeft_score() +
				" : " + getRight_score() + "]");
	}
}
