// 김찬우 220308
// 이중반복문 문제풀기
package Java1;

public class KimChanWoo {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int odd_sum=0;
		for (int i=1; i<=10; i++) {
			if (i%2==1) {
				odd_sum += i;
			}
		}
		System.out.println("1 + 3 + 5 + 7 + 9 = " +odd_sum);
		
		/*
		//증감식 변형해서 이중 없는 답
		odd_sum=0;
		for (int i=1; i<=10; i+=2) {
			odd_sum += i;
		}
		System.out.println("1 + 3 + 5 + 7 + 9 = " +odd_sum);
		System.out.println("----------------------------------");
	    */
		
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		int even_sum=0;
		for (int i=1; i<=10; i++) {
			if (i%2==0) {
				even_sum += i;
			}
		}
		System.out.println("2 + 4 + 6 + 8 = " + even_sum);
		System.out.println("----------------------------------");
		
		/*
		 * 문제 3. 가로8 세로8
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		for (int i=1; i<=8; i++) {
			for (int j=1; j<=8; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		System.out.println("----------------");

		
		/*
		 * 문제 4. 가로8 세로8 삼각형
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		for (int i=1; i<=8; i++) {
			int j = 9-i;
			while (j>0) {
				System.out.print("★");
				j--;
			}
			System.out.print("\n");
		}
		System.out.println("----------------");
		
		/*
		 * 문제 5. 가로8 세로8 삼각형 거꾸로
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		for (int i=1; i<=8; i++) {
			int j = i;
			while (j>0) {
				System.out.print("★");
				j--;
			}
			System.out.print("\n");
		}
		System.out.println("----------------");
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
		for (int i=2; i<10; i++) {
			System.out.println(i + "단");

			for (int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("---");
		}
		
		System.out.println("\n");
		
		/*
		int i = 2;
		
		while (i<10) {
			System.out.println(i + "단");
			int j = 1;
			while (j<10) {
				System.out.println(i + " x " + j + " = " + i*j);
				j++;
			}
			System.out.println("---");
			i++;
		}
		*/
		
		
		
		
	}

}
