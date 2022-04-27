package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		
		QNAArticle qa = new QNAArticle();
		
		qa.setNum(1022);
		qa.setTitle("비트코인 언제 올라?");
		qa.setAnswer("1개월 존버");
		
//		System.out.println(qa.getNum());
//		System.out.println(qa.getTitle());
//		System.out.println(qa.getAnswer());
		
//		System.out.println("질문/답변 [글번호 = " + qa.getNum() 
//				+ ", 제목 = " + qa.getTitle()
//				+ ", 답변 = " + qa.getAnswer() + "]");
		
		System.out.println( qa.toString() );
		
		System.out.println("===================================================");
		
		FileArticle fart = new FileArticle();
		
		fart.setNum(98);
		fart.setTitle("배고파");
		fart.setFileName("밥 먹고싶다");
		
		System.out.println( fart.toString() );
	}

}
