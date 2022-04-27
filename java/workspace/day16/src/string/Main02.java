package string;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일을 추출하기
		 * - 8005011234567 -> 1980년 05월 01일 남자
		 * - 뒷자리의 첫 번째	: 1, 2 : 19 ~ / 3, 4 : 20 ~
		 *					: 1, 3 : 남성 / 2, 4 : 여성
		 */
		String jumin = "0005011234567";
		
		// 주민번호를 년, 월, 일 단위로 각 두 글자씩 자르기
		String year = jumin.substring(0, 2);
		String month = jumin.substring(2, 4);
		String date = jumin.substring(4, 6);
		String gender = "";
		
		// 뒷 부분의 첫 글짜는 성별코드이므로 별도 추출
		String def = jumin.substring(6, 7);
		
		// 태어난 년도의 판별
		if( def.equals("1") || def.equals("2") ) {
			year = 19 + year;
		} else if( def.equals("3") || def.equals("4") ) {
			year = 20 + year;
		}
		
		// 성별
		if( def.equals("1") || def.equals("3") ) {
			gender = "남자";
		} else if( def.equals("2") || def.equals("4") ) {
			gender = "여자";
		}
		
		// 형식에 맞춘 내용 출력(String.format + System.out.println)
		
		System.out.printf("%s년 %s월 %s일 %s", year, month, date, gender);
		
//		System.out.println( "정보 : " + year + "년 " + month + "월 "
//				+ date + "일 " + gender );
	
	}

}
