package extendsclass;

/*
 * 클래스 다이어그램을 참고해 FileArticle 클래스 완성
 * 
 * Main02 class 에서 객체 생성
 * 
 * toString() 메서드 호출
 */

public class FileArticle extends Article {
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String toString() {
		return "파일 [글 번호 = " + getNum() + ", 글 제목 = " + getTitle()
				+ ", 첨부파일 = " + getFileName() + "]";
	}
}
