package operator;

public class Main01 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean result1 = (a != b) || (a == b);		// T || F -> True
		boolean result2 = (a < b) || (x > y);		// T || T -> True
		boolean result3 = (a < b) || (x < y);		// T || F -> True
		boolean result4 = (a > b) || (x > y);		// F || T -> True
		boolean result5 = (a > b) || (x < y);		// F || F -> False
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		System.out.println("--------------------------------------");
		
		boolean r1 = (a >= b);			// False
		boolean r2 = (x >= y);			// True
		boolean result6 = r1 && r2;		// F && T -> False
		boolean result7 = r1 || r2;		// F || T -> True
		
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		
		System.out.println("--------------------------------------");
		
		boolean success = true;
		boolean fail = !success;	// !true -> False
		
		System.out.println("success : " + success);
		System.out.println("fail : " + fail);
		
		
	}

}
