package othersproj;

public class Loading {
	// 게임창 전환을 위한 로딩창
	public void loading() {
		try {
			Thread.sleep(3000); // 3초 대기
		} catch (InterruptedException e) {}
		
		for (int i = 0; i < 50; i++) {	// 창전환을 위한 공백
			System.out.println();
		}
		
		System.out.print("loading");
		
		try {
			Thread.sleep(1000); // 1초 대기
		} catch (InterruptedException e) {}
		
		System.out.print(".");
		
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {}
		
		System.out.print(".");
		
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {}
		
		System.out.println(".");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		
	}
}
