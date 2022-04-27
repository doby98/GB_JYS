package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("int type 입력 : ");
		int i = sc.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.println("double type 입력 : ");
		double d = sc.nextDouble();
		System.out.println("double 결과 : " + d);
		
		System.out.println("String 입력 : ");
		String s = sc.next();
		System.out.println("String 결과 : " + s);
		
		sc.close();
	}

}
