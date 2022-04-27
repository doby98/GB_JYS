package condition;

public class Main09 {

	public static void main(String[] args) {
		/*
		 * 문제 1. 만약 3,000원 이상의 돈을 가지고 있으면 택시를 타고, 그렇지 않으면 걸어가라.
		 */
		
		System.out.println("문제 1.");
		int money1 = 2000;
		
		if (money1 >= 3000) {
			System.out.println("택시를 타고 가라!");
		} else {
			System.out.println("걸어가라!");
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * 문제 2. 만약 돈이 3,000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라. 
		 */
		
		System.out.println("문제 2.");
		int money2 = 2000;
		boolean card = true;
		
		if ((money2 >= 3000) || (card)) {
			System.out.println("택시를 타고 가라!");
		} else {
			System.out.println("걸어가라!");
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * 문제 3. 어떤 특정 정수 값 a가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		 */
		
		System.out.println("문제 3.");
		int a = 3121;
		
		if (a % 2 == 0) {
			System.out.println(a + "은(는) 짝수");
		} else {
			System.out.println(a + "은(는) 홀수");
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * 문제 4. 특정 정수값 a2, b2, c2의 최댓값을 구하여라
		 */
		
		System.out.println("문제 4.");
		int a2 = 100, b2 = 20, c2 = 900;
		int max = 0;	// 문자열은 null이나 ""으로 초기값을 설정할 수 있다.
		
		System.out.print("최댓값 : ");
		
		if ((a2 > b2) && (a2 > c2)) {	// 최댓값은 a2
			max = a2;
		} else {	// 최댓값이 a2가 아닌 경우
			if (b2 > c2) {
				max = b2;
			} else {
				max = c2;
			}
		}
		
		System.out.println(max);
		
//		if (a2 < b2) {
//			if (b2 < c2) {
//				System.out.println(c2);
//			} else {
//				System.out.println(b2);
//			}
//		} else {
//			if (a2 < c2) {
//				System.out.println(c2);
//			} else {
//				System.out.println(a2);
//			}
//		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * 문제 5-1. 국어, 영어, 수학 점수의 평균이 95점 이상이면 "장학생"을 출력하여라.
		 * 문제 5-2. 그리고 국어 점수가 70점 이상이면 "국어 합격", 그렇지 않으면 "국어 불합격"을 출력하여라
		 * 문제 5-3. 수학 점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점",
		 *         60점 이상이면 "D학점", 나머지 "F학점"을 출력
		 */
		
		int korea = 65, english = 95, math = 84;
		
		// 문제 5-1.
		
		System.out.println("문제 5-1.");
		double average = (korea + english + math) / 3;
		System.out.println("평균 : " + average);
		if (average >= 95) {
			System.out.println("장학생");
		}
		
		// 문제 5-2
		
		System.out.println("문제 5-2.");
		
		if (korea >= 70) {
			System.out.println("국어 합격");
		} else {
			System.out.println("국어 불합격");
		}
		
		// 문제 5-3
		
		System.out.println("문제 5-3.");
		
		if (math >= 90) {
			System.out.println("A학점");
		} else if (math >= 80) {
			System.out.println("B학점");
		} else if (math >= 70) {
			System.out.println("C학점");
		} else if (math >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		System.out.println("----------------------------------------");
		
		///////////////////////////////// switch-case
		
		/*
		 * 문제 1. 1은 "축구", 2는 "농구", 3은 "야구", 4는 "배구", 그 외는 "배드민턴"을 출력
		 */
		
		System.out.println("문제 1.");
		int order = 4;
		
		switch (order) {
		case 1:
			System.out.println("축구");
			break;
			
		case 2:
			System.out.println("농구");
			break;
			
		case 3:
			System.out.println("야구");
			break;
			
		case 4:
			System.out.println("배구");
			break;
			
		default:
			System.out.println("배드민턴");
			break;
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * 문제 2. 숫자가 3이면 "안녕"이 세 줄, 숫자가 2이면 "안녕"이 두 줄, 숫자가 1이면 "안녕"이 한 줄,
		 *       그 외는 "잘가"를 출력
		 */
		
		System.out.println("문제 2.");
		int line = 2;
		
		switch (line) {
		case 3:
			System.out.println("안녕");
			
		case 2:
			System.out.println("안녕");
			
		case 1:
			System.out.println("안녕");
			break;
			
		default:
			System.out.println("잘가");
			break;
		}
		
		System.out.println("----------------------------------------");
		
	}

}
