package test3;

import java.util.Scanner;

// 7.main 메서드를 포함하는 클래스를 생성 한다.

public class Exam01 {

	public static void main(String[] args) {
		// 8. 2개의 정수를 입력 받는다.
		int x = 64;
		int y = 12;
		
		// 9. 입력 받은 정수를 각각 출력 한다
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// 10. main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.
		Calc c = new Calc("정유섭");
		
		// 11. main 메서드에서 본인의 이름을 출력한다.
		System.out.println("이름 : " + c.getStr1());
		
		// 12. Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.
		int result1 = c.plus(x, y);
		System.out.println("plus : " + result1);
		
		int result2 = c.minus(x, y);
		System.out.println("minus : " + result2);
		
		// 13. Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.
		int result3 = c.times(x, y);
		System.out.println("times : " + result3);
		
		int result4 = c.divide(x, y);
		System.out.println("divide : " + result4);
	}

}
