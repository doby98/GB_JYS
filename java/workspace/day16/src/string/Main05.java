package string;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라고 하는 객체로 생성한 뒤에, 다음의 형태로 출력하시오
		 * (split() 메서드 사용 금지)
		 * ---------------------------------------------------------
		 * 파일이름 	: food
		 * 확장자		: jpg
		 * 폴더명		: D:/photo/2022/travel 
		 */
		
		String data = new String("D:/photo/2022/travel/food.jpg");
//		System.out.println(data);
		
		int name_idx = data.lastIndexOf("/");
		int ext_idx = data.lastIndexOf(".");
		
		// 소스파일 폴더 이름 추출
		String folder = data.substring(0, name_idx);
		
		// 파일 이름 추출
		String name = data.substring(name_idx + 1, ext_idx);
		
		// 확장자 추출
		String extension = data.substring(ext_idx + 1);
		
		System.out.println("파일이름\t: " + name + "\n확장자\t: " + 
						extension + "\n폴더명\t: " + folder);
//		System.out.println("파일이름 	: " + name);
//		System.out.println("확장자	: " + extension);
//		System.out.println("폴더명 	: " + folder);
	}

}
