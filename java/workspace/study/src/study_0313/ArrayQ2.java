package study_0313;

/*
 * 오류가 난다면 맨 위 package 이름을 현 위치 패키지명으로 바꿔주세요!
 * 
 * 문제. 정수 배열을 입력받아 올림차순으로 정렬된 배열을 출력하는 메서드를 만드시오.
 * 
 * 예) 	int arr = { 5, 3, 4, 2, 1 }
 * 		Lineup(arr);
 *		결과: 1 2 3 4 5
 * 
 * 힌트1. 배열을 입력받는 메서드는 다음과 같이 생성하면 된다.
 * 		public static void Method(int[] arr)
 * 
 * 힌트2. 
 * 선택정렬의 과정 : https://drive.google.com/file/d/1SUzKO-23atNmWn9L71l5k-ENIK45q19l/view?usp=sharing
 * "선택정렬"은 정렬 알고리즘의 하나로, 다음과 같은 순서로 이루어진다.
 * 주어진 배열 중에 최솟값을 찾는다.
 * -> 그 값은 맨 앞에 위치한 값과 교체한다.
 * -> 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 교체한다.
 */

public class ArrayQ2 {
	public static void main(String[] args) { 
		
		int[] arr = {51, 23, 402, 22, 117};
		lineUp(arr);
		
				
	}
	
	public static void lineUp(int[] arr) {
		int tmp = 0;
		
		for( int i = 0; i < (arr.length - 1); i++) {
			for( int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for( int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
