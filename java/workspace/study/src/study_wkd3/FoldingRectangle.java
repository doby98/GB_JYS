package study_wkd3;

public class FoldingRectangle {

	public static void main(String[] args) {
		/*
		 * 종이를 접지 않으면 사각형의 개수 1
		 * 종이를 한번 접으면 사각형의 개수 2
		 * 종이를 두번 접으면 사각형의 개수 4
		 * 			...
		 * 처음으로 사각형 개수가 500개를 넘어갔을 때 종이를 접은 횟수와 사각형 개수 출력
		 * 
		 * 출력 결과 예시 > 접은 횟수 : n번 / 사각형 개수 : n개
		 * */
		
		int square = 1;
		int fold = 0;
		
		for( square = 1; square <= 500; square *= 2 ) {
			fold++;			
		}
		
		System.out.println("종이를 접은 횟수 : " + fold);
		System.out.println("사각형 횟수 : " + square);
		
		
		
	}

}
