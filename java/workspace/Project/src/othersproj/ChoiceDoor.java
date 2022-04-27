package othersproj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChoiceDoor extends ForChoice {

	@Override
	void guidance() {
		System.out.println("당신의 눈 앞에 놓인 세 개의 문의 명패에는 각각 번호가 음각되어 있습니다.");
		
		sleep(1000);
		
		System.out.println("마음에 드는 문을 열고 들어가세요.");
	}
	
	@Override
	public void choice() {
		
		sleep(3000);
		
		// 행운 스탯, 이성 스탯, 열쇠 갯수 불러오기
		String[] arr1 = null;
		String data = "";
		try {
			File file = new File("stats.txt");
			if(file != null) {	// file이 null이 아닌때 진행
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				data = br.readLine();	// 한줄씩 읽어오는 기능 
				fr.close();
				br.close();
				arr1 = data.split("/");	// "/"을 기준으로 데이타를 각각 배열에 담아줌
			}
		} catch (Exception e) {}
		
		int[] arr2 = new int[3];
		// 텍스트 파일에서 불러와 arr1 배열에 저장한 값은 String 타입이기 때문에 int 타입의 배열에 다시 담아준다. 
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
		}
		
		// 각 배열의 값을 저장할 변수 지정
		setLuckyPoint(arr2[0]);
		setReasonPoint(arr2[1]);
		setGatherKey(arr2[2]);
		
		
		while(true) {
			
			// 1~100까지 숫자 랜덤 부여
			int door1 = Util.getInstance().random(1, 100);
			int door2 = Util.getInstance().random(1, 100);
			int door3 = Util.getInstance().random(1, 100);
			
			// 현재 stats 출력
			System.out.println("===================================================================");
			System.out.println("당신의 행운 : " + getLuckyPoint() + ", 당신의 이성 : " + getReasonPoint() + ", 획득한 열쇠 개수 : " + getGatherKey());
			System.out.println("===================================================================");
			
			// 랜덤으로 받아온 숫자를 가진 문 출력
			System.out.println("A문 : " + door1 + " / B문 : " + door2 + " / C문 : " + door3);
			
			// 행동 선택지
			System.out.println("[ 행동 선택지 ]");
			System.out.println("1. A문 열기\n2. B문 열기\n3. C문 열기"
					+ "\n4. 리셋\n5. 이전으로 돌아가기 \n6. 포기하기");
			
			// do~while문으로 행동선택지 반복
			do {
				System.out.println("원하는 선택지의 번호를 입력해주세요.");
				System.out.print(">>>");
				String num = sc.next();
				
				// Integer.parseInt()로 String을 숫자로 형변환 할 경우,
				// 위에 num을 받을 땐 아무거나 받아도 에러가 나지 않지만,
				// Int로 변환 시 에러가 발생하므로 예외처리(continue;)
				try {
					switch (Integer.parseInt(num)) {
					case 1:
						// door1의 크기가 내가 가진 행운스탯보다 클 경우 노이즈가 발생하면서 이성이 랜덤으로 차감된다.
						// 이성스탯이 0이하가 되면 게임은 종료된다.
						if(door1 > getLuckyPoint()) {
							noise();
							System.out.println("세상이 노이즈 낀 듯 울렁거립니다. 랜덤으로 당신의 이성에 타격이 있습니다.");
							
							// 1 ~ 4까지 수 랜덤 출력 후 이성에서 마이너스
							int attack = Util.getInstance().random(1, 4);
							System.out.println("당신의 이성이 " + attack + " 깎였습니다.");
							setReasonPoint(getReasonPoint()-attack);
							System.out.println("당신의 이성이" + getReasonPoint() + "이 되었습니다.");
							setExit(0);	// do~while문 반복
							
							// 이성이 0보다 작거나 같아지는 경우
							if(getReasonPoint() <= 0) {
								System.out.println("당신은 미치고 말았습니다.");
								System.out.println("============================ Game Over ============================");
								setExit(2);	// 게임 종료 넘버
								break;
							} 
							
							break; // case 1 break;
							
						} else {
							System.out.println("올바른 문을 찾아냈습니다.");
							setExit(1); // 메인에서 살아남는 종료 넘버
							break; // case 1 break;
						}
						
					case 2:
						if(door2 > getLuckyPoint()) {
							noise();
							System.out.println("세상이 노이즈 낀 듯 울렁거립니다. 랜덤으로 당신의 이성에 타격이 있습니다.");
							
							// 1 ~ 4까지 수 랜덤 출력 후 이성에서 마이너스
							int attack = Util.getInstance().random(1, 4);
							System.out.println("당신의 이성이 " + attack + " 깎였습니다.");
							setReasonPoint(getReasonPoint()-attack);
							System.out.println("당신의 이성이" + getReasonPoint() + "이 되었습니다.");
							setExit(0);
							
							if(getReasonPoint() <= 0) {	// 이성이 0보다 작거나 같아지면 game over
								System.out.println("당신은 미치고 말았습니다.");
								System.out.println("============================ Game Over ============================");
								setExit(2);	// 게임 종료 넘버
								break;
							} 
							
							break; // case 2 break;
							
						} else {
							System.out.println("올바른 문을 찾아냈습니다.");
							setExit(1); // 메인에서 살아남는 종료 넘버
							break; // case 2 break;
						}
						
					case 3:
						if(door3 > getLuckyPoint()) {
							noise();
							System.out.println("세상이 노이즈 낀 듯 울렁거립니다. 랜덤으로 당신의 이성에 타격이 있습니다.");
							
							// 1 ~ 4까지 수 랜덤 출력 후 이성에서 마이너스
							int attack = Util.getInstance().random(1, 4);
							System.out.println("당신의 이성이 " + attack + " 깎였습니다.");
							setReasonPoint(getReasonPoint()-attack);
							System.out.println("당신의 이성이" + getReasonPoint() + "이 되었습니다.");
							setExit(0);
							
							if(getReasonPoint() <= 0) {	// 이성이 0보다 작거나 같아지면 game over
								System.out.println("당신은 미치고 말았습니다.");
								System.out.println("============================ Game Over ============================");
								setExit(2);	// 게임 종료 넘버
								break;
							} 
							
							break;	// case 3 break;
							
						} else {
							System.out.println("올바른 문을 찾아냈습니다.");
							setExit(1); // 메인에서 살아남는 넘버
							break; // case 3 break;
						}
						
					case 4:
						// 리셋
						setExit(3);	// do~while문 반복 넘버
						break; // case 4 break;
						
					case 5:	
						// 복도로 돌아가는 선택지
						System.out.println("이전 선택지로 돌아갑니다.");		// 메인에서 if문으로 처리해주어야 함
						setExit(5); // 메인에서 살아남는 종료 넘버
						break;// case 5 break;
						
					case 6:
						// 게임 포기 선택지
						giveUp();
						break;	//case 6 break;
						
					default:
						// 잘못 입력한 부분에 대한 처리
						System.out.println("잘못 입력하셨습니다.");
						break;	// default break;
					}
				} catch (NumberFormatException e) {
					System.out.println("[ERROR] 숫자만 입력해야 합니다!");
					continue;
				} catch (Exception e) {
					System.out.println("[ERROR] 알 수 없는 에러입니다. 관리자에게 문의하세요.");
					e.printStackTrace();
				}

			} while(getExit()<1);
			// 메인으로 돌아간다
			if(getExit() == 1 || getExit() == 2 || getExit() == 5) {break;}
			// do~while문으로 돌아간다
			else if(getExit() == 3) {continue;}
		}
		
		// stats.txt에 저장하기
		int[] arr = {getLuckyPoint(), getReasonPoint(), getGatherKey()};
		
		String data2 = "";
		for (int i = 0; i < arr.length; i++) {
			data2 += arr[i] + "/";
		}
		data2 = data2.substring(0, data2.length()-1);
		
		try {
			FileWriter fw = new FileWriter("stats.txt", false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data2);
			bw.close();
		} catch (IOException e) {}
	}
}
