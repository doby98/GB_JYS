package study_wkd3;

import java.util.Scanner;

/*
 *  Scanner를 통해 점수를 입력 받고, 점수에 맞는 학점을 출력하시오.
 *  95~100 : A+, 90~94 : A, 85~89 : B+, 80~84 : B, 75~79 : C+ 70~74 : C
 *  60~69 : D, 나머지 : F  
 *  
 *  switch문을 if문으로 변경해보기!
 */


public class SwitchTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 >> ");
		int score = sc.nextInt();
		String grade = "";
		int opt = (int)Math.round((score % 10) / 10.0); 
		
		if( score > 100 ) {
			System.out.println("거짓말!");
		}
		
		switch (score / 10) {
		
		case 10:
			grade = "A+";
			break;
			
		case 9:
			switch (opt) {
			case 1:
				grade = "A+";
				break;
				
			default:
				grade = "A";
				break;
			}
			break; 
			
		case 8:
			switch (opt) {
			case 1:
				grade = "B+";
				break;
				
			default:
				grade = "B";
				break;
			}
			break;
			
		case 7:
			switch (opt) {
			case 1:
				grade = "C+";
				break;
				
			default:
				grade = "C";
				break;
			}
			break;
			
		case 6:
			grade = "D";
			break;
			
		default:
			grade = "F";
			break;							
		}
		
		System.out.println(grade);
//		sc.close();
	}
}
