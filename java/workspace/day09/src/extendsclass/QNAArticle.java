package extendsclass;

/*
 * Article 클래스 상속받고,
 * 부모클래스의 title을 질문으로 보고, 답변을 추가
 * main 메서드를 포함하고 있는 class 생성
 * 글 번호, 질문, 답변 데이터 set
 * 글 번호, 질문, 답변 데이터 get으로 출력
 */

public class QNAArticle extends Article {
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toString() {
		return "질문/답변 [글번호 = " + getNum() + ", 제목 = " + getTitle()
				+ ", 답변 = " + getAnswer() + "]";
	}

}
