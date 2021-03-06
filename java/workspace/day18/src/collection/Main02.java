package collection;

import java.util.List;
import java.util.ArrayList;

public class Main02 {
	
	public static void main(String[] args) {
		/*
		 * 객체 생성시 제너릭스의 사용
		 * -> 클래스 이름 오른쪽에 <자료형>의 형식으로 표현한다.
		 * 이 때, 자료형에는 클래스 타입만 가능하다.
		 * 기본 데이터형을 사용하고자 하는 경우에는
		 * 해당 데이터의 Wrapper Class를 사용해야 한다.
		 */
		
		List<Integer> numberList = new ArrayList<Integer>();
		List<String> stringList = new ArrayList<String>();
		
		
		// 데이터 추가하기
		numberList.add(10);		// 0번
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		numberList.add(70);
		numberList.add(80);
		numberList.add(90);
		
		// 데이터의 수량
		int count = numberList.size();
		System.out.println("데이터 크기 : " + count);
//		System.out.println("numberList length : " + numberList.size());
		
		// 5번째 요소의 값 얻기, 50
		int value = numberList.get(4);
		System.out.println("5번째 요소의 값 : " + value);
//		System.out.println("numberList 5th : " + numberList.get(4));
		
		// 5번째 요소의 값 삭제
		numberList.remove(4);
//		System.out.println("numberList 5th remove : " + numberList.remove(4));
		
		// 하나를 삭제 후, 전체 크기 다시 조회
		count = numberList.size();
		System.out.println("데이터 크기 : " + count);
//		System.out.println("numberList remove 1th : " + numberList.remove(0));
//		System.out.println("numberList length : " + numberList.size());
		
		// 5번째 요소의 값 다시 얻기
		value = numberList.get(4);
		System.out.println("5번째 요소의 값 : " + value);
//		System.out.println("numberList new 5th : " + numberList.get(4));
		
		// 5번째 자리에 데이터 추가
		numberList.add(4, 123);
		value = numberList.get(4);
		System.out.println("5번째 요소의 값 : " + value);
		
		// 전체삭제
		numberList.clear();
		count = numberList.size();
		System.out.println("데이터 크기 : " + count);
		
		System.out.println(stringList.size());
	}
}











