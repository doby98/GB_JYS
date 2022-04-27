package othersproj;

public class ExitDoor extends ForChoice {

	@Override
	void guidance() {
		System.out.println("당신은 문 앞으로 이동되었습니다. 열쇠 세 개를 열쇠구멍에 넣고 돌립니다.");
		
		sleep(1000);
		
		System.out.println("찰칵 소리와 함께 문에 문제가 떠오릅니다.");
		
		sleep(1000);
		
		System.out.println("=================================================");
		
		System.out.println("D  R  E  A  M   ?  ?  ?  ?\r\n" + 
				"68 82 69 65 77  69 88 73 84");
		System.out.println("\n힌트\n아스라히\n사라지는\n키억");
		System.out.println("=================================================");
		
		sleep(1000);
		
		System.out.println("물음표에 올 영단어롤 입력하면 되는 문제 입니다. 키억은 오타일까요?");
	}

	@Override
	void choice() {
		while(true) {
			System.out.println("대소문자를 구별해서 정답을 입력해주세요.");
			System.out.print(">>>");
			String a = sc.next();
			
			if(a.trim().equals("EXIT")) {
				setExit(1);
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
