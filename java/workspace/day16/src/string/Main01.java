package string;

public class Main01 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디(student)와 도메인(java.com)을 구별하기
		
		// 이메일 주소 정의
		// split 사용 금지
		
		String email = "student@java.com";
		
		// "@"가 나타나는 위치 얻기
		int cut = email.indexOf("@");
		
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String id = email.substring(0, cut);
		
		// "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String domain = email.substring(cut + 1);
			
		System.out.println("ID : " + id);
		System.out.println("Domain : " + domain);				
		
	}

}
