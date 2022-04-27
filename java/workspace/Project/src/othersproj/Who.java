package othersproj;

public class Who extends Thread{
	// 게임 환영말
	public void sayWelcome() {
		
		// 3초 대기
		try {
			sleep(3000);
		} catch (InterruptedException e) {}
		
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		
		// 인사말 한 줄씩 출력. 출력마다 텀을 줌
		System.out.println("??? : 안녕하세요 꿈의 세계에 오신 걸 환영합니다.");
		
		try {
			Thread.sleep(2000); //2초 대기
		} catch (InterruptedException e) {}
		
		System.out.println("??? : -라고 말하고 싶지만 하필 오늘 오신 게 안타깝네요.");

		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {}
		
		System.out.println("??? : 오늘은 관리자가 부재중이어서 당신을 현실로 데려다 드릴 수가 없거든요.");
		
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {}
		
		System.out.println("			.");

		try {
			Thread.sleep(1000);	// 1초 대기
		} catch (InterruptedException e) {}	
		
		System.out.println("			.");
		
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {}
		
		System.out.println("			.");

		try {
			Thread.sleep(2000);	// 2초 대기
		} catch (InterruptedException e) {}
		
		System.out.println("??? : 으음, 할 수 없죠! 조금 고생스러우시겠지만 직접 나가시는 방법을 찾으셔야겠어요.");
		
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {}
		
		System.out.println("??? : 참고로 꿈 속의 시간은 현실과 달라서 오래 계시지 않는게 좋아요.");

		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {}
		
		System.out.println("??? : 그럼 행운을 빕니다.");
	}
	
	public void sayGoodBye() {
		System.out.println();
		
		System.out.println("??? : 짝짝짝짝-");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		System.out.println("??? : 축하드립니다. 무사히 문을 여셨군요.");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		System.out.println("??? : 그럼, 안녕히 가시고 다시 오지 마세요~");
	}
}
