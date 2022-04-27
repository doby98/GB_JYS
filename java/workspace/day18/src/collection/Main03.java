package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		
		// People Class로 ArrayList 생성
		/*
		 * List를 사용하는 가장 일반적인 방법은,
		 * 사용자 정의 클래스에 대한 객체를 포함하도록
		 * 지정하는 것이다.
		 */
		List<People> peopleList = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가
//		peopleList.add(new People("유섭", "8753"));
//		peopleList.add(new People("aa", "1111"));
//		peopleList.add(new People("bb", "2222"));
//		peopleList.add(new People("cc", "3333"));
//		peopleList.add(new People("dd", "4444"));
//		peopleList.add(new People("ee", "5555"));
//		peopleList.add(new People("ff", "6666"));
//		peopleList.add(new People("gg", "7777"));
//		peopleList.add(new People("hh", "8888"));
//		peopleList.add(new People("ii", "9999"));
		
		for( int i = 0; i < 10; i++ ) {
			People p = new People("회원" + i, "010-1234-567" + i);
			peopleList.add(p);
//			peopleList.add( new People("회원" + i, "010-1234-567" + i) );
		}
		
		// 출력하기
		for( int i = 0; i < peopleList.size(); i++ ) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스형의 객체이다.
			People item = peopleList.get(i);
			System.out.println( "리스트의 데이터 " + (i+1) + "번째 : " + item.toString() );
		}
		
		
	}

}
