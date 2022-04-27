package study_4_2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 2017년에 이어, 2018년에도 카카오 코드 페스티벌이 개최된다!
 * 
 * 카카오 코드 페스티벌에서 빠질 수 없는 것은 바로 상금이다. 
 * 2017년에 개최된 제1회 코드 페스티벌에서는, 본선 진출자 100명 중 21명에게 아래와 같은 기준으로 상금을 부여하였다.
 * 
 * 2018년에 개최될 제2회 코드 페스티벌에서는 상금의 규모가 확대되어, 본선 진출자 64명 중 31명에게 아래와 같은 기준으로 상금을 부여할 예정이다.
 * 
 * 제이지는 자신이 코드 페스티벌에 출전하여 받을 수 있을 상금이 얼마인지 궁금해졌다. 
 * 그는 자신이 두 번의 코드 페스티벌 본선 대회에서 얻을 수 있을 총 상금이 얼마인지 알아보기 위해, 상상력을 발휘하여 아래와 같은 가정을 하였다.
 * 제1회 코드 페스티벌 본선에 진출하여 a등(1 ≤ a ≤ 100)등을 하였다. 단, 진출하지 못했다면 a = 0으로 둔다.
 * 제2회 코드 페스티벌 본선에 진출하여 b등(1 ≤ b ≤ 64)등을 할 것이다. 단, 진출하지 못했다면 b = 0으로 둔다.
 * 제이지는 이러한 가정에 따라, 자신이 받을 수 있는 총 상금이 얼마인지를 알고 싶어한다.
 * 
 * 첫 번째 줄에 제이지가 상상력을 발휘하여 가정한 횟수 T(1 ≤ T ≤ 1,000)가 주어진다.
 *
 * 입력
 * 다음 T개 줄에는 한 줄에 하나씩 제이지가 해본 가정에 대한 정보가 주어진다. 
 * 각 줄에는 두 개의 음이 아닌 정수 a(0 ≤ a ≤ 100)와 b(0 ≤ b ≤ 64)가 공백 하나를 사이로 두고 주어진다.
 * 
 * 출력
 * 각 가정이 성립할 때 제이지가 받을 상금을 원 단위의 정수로 한 줄에 하나씩 출력한다.
 * 입력이 들어오는 순서대로 출력해야 한다.
 */

public class Price_jys {
	Scanner sc = new Scanner(System.in);
	
	private int times = 0;
	private int[][] ranking;
	private int[] prize17 = {5000000, 3000000, 2000000, 500000, 300000, 100000};
	private int[] prize18 = {5120000, 2560000, 1280000, 640000, 320000};
	private int[] total_prize;
	
	public Price_jys() {
		System.out.println("몇 번 상상쓰?");
		this.times = sc.nextInt();
	}
	
	public int[] getTotal_prize() {
		return total_prize;
	}
	
	public void setTotal_prize(int[] total_prize) {
		this.total_prize = total_prize;
	}
	
	public void setArr() {
		if( this.times >= 1 && this.times <= 1000 ) {
			this.ranking = new int[this.times][2];
			this.total_prize = new int[this.times];
		}
	}
	
	public void setRank() {
		for( int i = 0; i < this.times; i++ ) {
			System.out.println((i+1) + "번째 예상의 17년도 등수를 입력하시오!");
			this.ranking[i][0] = sc.nextInt();
			
			System.out.println((i+1) + "번째 예상의 18년도 등수를 입력하시오!");
			this.ranking[i][1] = sc.nextInt();
			
			System.out.println(Arrays.toString(this.ranking[i]));
		}
	}

	public int[] reward() {
		
		for( int i = 0; i < this.times; i++ ) {		
			int sum1 = 0;
			int sum2 = 0;
			
			for( int j = 1; j <= this.prize17.length; j++ ) {
				sum1 += j;
				if( this.ranking[i][0] <= sum1 ) {
					this.total_prize[i] += prize17[j-1];
					break;
				}					
			}
			System.out.println(i + " " + this.total_prize[i]);
		
		
			for( int k = 0; k < this.prize18.length; k++ ) {
				sum2 += (int)Math.pow(2, k);
				if( this.ranking[i][1] <= sum2) {
					this.total_prize[i] += prize18[k];
					break;
				}			
			}
			System.out.println(i + " " + this.total_prize[i]);	
		
		}
		return this.total_prize;
		
	}
}
