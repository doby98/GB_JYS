package array;

public class Main02 {
	// 11시 30분
	public static void main(String[] args) {
		
		// 문제 1. num 배열에 저장된 요소의 합을 구하시오
		System.out.println("<문제 1>");
		
		int[] num = new int[] {22, 3, 8, 12, 55};
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("num의 합 = " + sum);
		System.out.println("--------------------------------------");
				
		// 문제 2. num2 배열에 저장된 요소의 합과 평균을 구하시오
		System.out.println("<문제 2>");
		
		int[] num2 = new int[] {60, 95, 88};
		
		float sum2 = 0F;
		float avg = 0;
		
		for (int i = 0; i < num2.length; i++) {
			sum2 += num2[i];
		}
		
		avg = sum2 / num2.length;
		
		System.out.println("num2의 합 = " + sum2 + ", 평균 = " + avg);
		System.out.println("--------------------------------------");
		
		// 문제 3. num3 배열에 저장된 요소의 최대값을 출력하시오.
		System.out.println("<문제 3>");
		
		int[] num3 = {98, 805, 95, 88, 90};
		
//		int max = 0;
//		
//		for (int i = 0; i < (num3.length - 1); i++) {
//			if (num3[i] > num3[i+1]) {
//				num3[i+1] = num3[i];
//			}
//		}
//		
//		max = num3[(num3.length -1)];
		
		int max = num3[0];
		
		for (int i = 1; i < num3.length; i++) {
			if (max < num3[i]) {
				max = num3[i];
			}
		}
		
		System.out.println("num3의 최댓값 : " + max);
		System.out.println("--------------------------------------");
		
		// 문제 4. num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		System.out.println("<문제 4>");
		
		int[] num4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum_o = 0;
		int sum_e = 0;
		
		for (int i = 0; i < num4.length; i++) {	// 짝수인 경우
			if (num4[i] % 2 == 0) {
				sum_e += num4[i];
			} else {	// 홀수인 경우
				sum_o += num4[i];
			}
		}
		
		System.out.println("num4의 홀수의 합 : " + sum_o);
		System.out.println("num4의 짝수의 합 : " + sum_e);
		
	}

}
