package study_0313;

/*
 * 문제1 : 지불한 금액을 나타내는 파라미터1, 물건의 가격을 나타내는 파라미터2
 * 		이렇게 두 개의 파라미터를 받아 가작 적은 수의 지폐를 거슬러 주는 메소드를 만들어 주세요.
 * 		(단위는 50000, 10000, 5000, 1000 원입니다.)
 * 
 * 예) change(100000, 23000);
 * 	출력결과 -> 50000원 지폐 : 1장
 * 		 	 10000원 지폐 : 2장 
 * 			  5000원	지폐 : 1장
 * 			  1000원 지폐 : 2장
 * ---------------------------------------------------------------------
 * 문제2 : 파라미터로 양의 정수 n을 받고 n!을 계산해서 리턴해주는 메소드를 만들어 보세요!
 *  	(주의! : 0!은 1입니다. System.out.println(factorial(0)); -> 1 출력)
 *  
 *  예) System.out.println(factorial(6));
 *  	출력결과 -> 720
 *  ---------------------------------------------------------------------
 * 문제3 : 파라미터로 총 항의 수(n)를 받고, 입력한 총 항을 차례대로 출력하는 메소드를 만들어 보세요!
 *  
 *  예) fibonacci(10) 
 *    출력결과 ->  1 1 2 3 5 8 13 21 34 55 (한 항씩 줄바꿈으로 출력)
 *  ---------------------------------------------------------------------
 * 문제4 : 정수 배열을 입력받아 올림차순으로 정렬된 배열을 출력하는 메서드를 만드시오.
 * 
 * 예) 	int arr = { 5, 3, 4, 2, 1 }
 * 		Lineup(arr);
 *		결과: 1 2 3 4 5
 */

public class KCW {
	// main 메서드
	public static void main(String[] args) { 
				
		change(100000, 23000);
		System.out.println("--------------------");
		
		System.out.println(factorial(5));
		System.out.println("--------------------");

		fibonacci(10);
		System.out.println("--------------------");

		int[] k = { 5, 3, 4, 2, 1 };
		Lineup(k);
				
	}
	//---------------------------------------------------------------------
	// 금액과 상품값을 입력받아 적은 수의 지폐로 거슬러주는 메서드
	public static void change(int pay, int price) {
		
		int change = pay - price;
		int[] bills = {50000, 10000, 5000, 1000};
		for (int i = 0; i < bills.length; i++) {
			int bill = bills[i];
			int num = change/bill;
			change = change%bill;
			System.out.println(bill + "원 지폐 : " + num);
		}
		System.out.println("지폐로 줄 수 없는 거스름돈: " + change);
	}
	//---------------------------------------------------------------------
	// 정수 입력받아 팩토리알값 반환하는 메서드
	public static int factorial(int num) {
		int result = 1;
		
		if (num != 0) {
			for (int i = 1; i <= num; i++) {
				result *= i;
			}
		} else {
			return 1;
		}
		
		return result;
	}
	//---------------------------------------------------------------------
	// 정수 입력받아 피보나치 수열 출력하는 메서드
	public static void fibonacci(int num) {
		int start = 0;
		int next = 1;
		int next_next = 1;
		for (int i = 1; i <= num; i++) {
			next = next_next;
			next_next = start+next;
			start = next;
			System.out.println(next);
		}
	}
	//---------------------------------------------------------------------
	// 정수배열 입력받아 올림차순으로 출력하는 메서드
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
