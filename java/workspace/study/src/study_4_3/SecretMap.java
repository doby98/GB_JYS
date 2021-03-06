package study_4_3;

import java.util.Arrays;
import java.util.Scanner;

// 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
// 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

// 1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 “공백”(“ “) 또는 “벽”(“#”) 두 종류로 이루어져 있다.
// 2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 “지도 1”과 “지도 2”라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
// 		지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
// 3. “지도 1”과 “지도 2”는 각각 정수 배열로 암호화되어 있다.
// 4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다
// 네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.

/*
 * 입력 형식  
 * 	입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.
 *	1 ≦ n ≦ 16
 *	arr1, arr2는 길이 n인 정수 배열로 주어진다.
 *	정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2^n - 1을 만족한다.
 */

/*
 * 출력 형식
 * 원래의 비밀지도를 해독하여 "#", 공백으로 구성된 문자열 배열로 출력하라.
 */

public class SecretMap {
	Scanner sc = new Scanner(System.in) ;
	
	private int length = 0;
	
	private int[] arr1;
	private int[] arr2;
	private String[][] secretMap1;
	private String[][] secretMap2;
	private String[][] Map;
	
	private String[] AnsMap;
 	
	public void inner() {
		
		// 정사각형 배열의 크기과 다른 배열들의 크기를 정의
		System.out.println("정사각형 배열의 길이를 입력해 주시오");
		int n = sc.nextInt();
		System.out.println();
		
		this.length = n;
		this.arr1 = new int[n];
		this.arr2 = new int[n];
		
		this.secretMap1 = new String[n][n];
		this.secretMap2 = new String[n][n];
		this.Map = new String[n][n];
		this.AnsMap = new String[n];
		
		// arr1과 arr2의 원소를 입력 받기		
		for( int i = 0; i < this.length; i++ ) {
			System.out.println("arr1의 " + (i+1) + "번째 원소를 채워주세요");
			int ele = sc.nextInt();
			
			if( ele >= (int)Math.pow(2, this.length) || ele < 0) {
				System.out.println("입력값이 너무 크거나 음수입니다!");
				i--;
			} else {
				this.arr1[i] = ele;
			}	
		}
		
		System.out.println();
		
		for( int i = 0; i < this.length; i++ ) {
			System.out.println("arr2의 " + (i+1) + "번째 원소를 채워주세요");
			int ele = sc.nextInt();
			
			if( ele >= (int)Math.pow(2, this.length) || ele < 0) {
				System.out.println("입력값이 너무 크거나 음수입니다!");
				i--;
			} else {
				this.arr2[i] = ele;
			}	
		}
		
		System.out.println();
		
		// arr1과 arr2의 원소들을 바탕으로 secretMap1과 secretMap2를 채우기
		for( int i = 0; i < this.length; i++ ) {
			String b_num = "";
			
			for( int j = this.length - 1; j >= 0; j-- ) {
				b_num += (int)(this.arr1[i] / Math.pow(2, j));
				this.arr1[i] %= Math.pow(2, j);
			}
			
			System.out.println(b_num);
			
			for( int k = 0; k < this.length; k++ ) {
				this.secretMap1[i][k] = String.valueOf(b_num.charAt(k));
			}
		}
		System.out.println(Arrays.deepToString(this.secretMap1));
		
		System.out.println();
		
		for( int i = 0; i < this.length; i++ ) {
			String b_num = "";
			
			for( int j = this.length - 1; j >= 0; j-- ) {
				b_num += (int)(this.arr2[i] / Math.pow(2, j));
				this.arr2[i] %= Math.pow(2, j);
			}
			
			System.out.println(b_num);
			
			for( int k = 0; k < this.length; k++ ) {
				this.secretMap2[i][k] = String.valueOf(b_num.charAt(k));
			}
		}
		System.out.println(Arrays.deepToString(this.secretMap2));
		
		for( int i = 0; i < this.length; i++ ) {
			for( int j = 0; j < this.length; j++ ) {
				if( this.secretMap1[i][j].equals("0") && this.secretMap2[i][j].equals("0") ) {
					this.Map[i][j] = "0";
				} else {
					this.Map[i][j] = "1";
				}
			}
		}
		System.out.println(Arrays.deepToString(this.Map));
	}
	
	public void decode() {
		for( int i = 0; i < this.length; i++ ) {
			this.AnsMap[i] = "\"";
			
			for( int j = 0; j < this.length; j++ ) {
				if(this.Map[i][j].equals("0")) {
					this.Map[i][j] = "_";
				} else if( this.Map[i][j].equals("1")) {
					this.Map[i][j] = "#";
				}
				
				this.AnsMap[i] += this.Map[i][j];
			}
			this.AnsMap[i] += "\"";
		}
		
//		System.out.println(Arrays.deepToString(this.Map));
		System.out.println(Arrays.deepToString(this.AnsMap));
	}
	
}





































