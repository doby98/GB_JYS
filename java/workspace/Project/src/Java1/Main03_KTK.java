package Java1;

public class Main03_KTK {

	public static void main(String[] args) {
		// 문제 1, 1~10 까지 홀수 값의 합 
		System.out.println("1번------------------");
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}System.out.println(sum);
		
		
		System.out.println("2번------------------");
		// 문제 2, 1~10 까지 짝수 값의 합
		int sum2 = 0;
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				sum2+=i;
			}
		}System.out.println(sum2);
		
		
		System.out.println("3번------------------");
				
		int star =0;
		
		while(star<8) {
			star++;
			System.out.println("★★★★★★★★");
			
		}
		
		
		System.out.println("4번------------------");		
		 
		
		for(int j = 8; j>0; j--) {
			
			
				for(int i = 0; i<j; i++) {
					
					System.out.print("★");
					
					
				}	System.out.println();
		} 
		
		
		System.out.println("5번------------------");
				
		
	
		System.out.println("6번------------------");
		
		//문제 6. 2단~ 9단까지 구구단출력(결과만 나와도 가능)
		//2중 for 문, 2중 while문
				
				
				
	}

	
}
