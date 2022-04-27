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

public class ArrayA {
	// main 메서드
	public static void main(String[] args) { 
				
				int[] k = {6, 7, 3, 2, 4 ,5, 1};
				Lineup(k);
				// 결과값 1 2 3 4 5 6 7 순으로 나와야 함.
				
	}
	
	// 올림차순으로 출력하는 메서드 생성
	public static void Lineup(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			// 반복 1회 할 때마다 판별이 2개 이루어진다
			// 1차판별은 판별대상 key 뒤쪽 수 중 최솟값 min 찾기 & 그 위치의 index 찾는 것
			// 2차판별은 1차에서 찾은 min과 key를 비교, min이 더 작다면 둘의 위치를 바꾸는 것
 	
	//변수선언및할당		
			int key = arr[i];							// 판별대상 앞에서 맨 끝 바로 전 위치까지 설정
			int min = arr[i+1];							// 1차판별에 사용할, 최솟값 저장할 변수 생성
			int index = i+1;							// 1차판별에 사용할, 최솟값 index 저장할 변수 생성. i+1로 최초할당하는 이유는 아래에 있음.
	
			
	//1차판별
			//예시 ) 0번째 값을 key에 저장, 1번째 값을 min에 저장, 1번째 위치를 index에 저장했을 경우
			for (int j = i+1; j < arr.length; j++) {	// 1차판별은 1번째~n번째 값까지 진행
				
				if (arr[j]<min) {						// 1번째 값보다 2번째 값이 작다면,
					min = arr[j];						// min에 2번째 값을 저장
					index = j;							// index에 2번째 위치를 저장
				}
			}
			// 1차 판별 진행하면 2~n번째 값 중 최솟값과 그 위치를 알 수 있게 된다.
			// 1차 판별 시 1번째 값보다 작은 값들이 찾아지지 않았다면, min과 index에는 자동으로 1번째 값과 1번째 위치가 저장된다.
			
			
			
	//2차판별
			if (min<key) {			// 1차판별에서 찾은 최솟값 min이 key보다 작다면
				arr[i] = min;		// key의 위치에 min 할당
				arr[index] = key;	// min의 위치에 key 할당.
			}
			
			// 이걸 0번째 위치에서 완료하면, 0번째 위치에는 1~n번째 중 최솟값이었던 값이 들어가고, 그 위치에는 0번째 값이 들어간다.
			// 이제 0번째 위치의 값은 놔두고 1번째, 2번째, 3번째,... 위치에서 같은 과정을 그대로 반복한다.
		}
		
		// 최종적으로 정렬된 arr를 출력한다.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}



}
