package othersproj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChoiceStartRoom extends ForChoice {

	// 부모에서 상속받아온 guidance 오버라이드
	// 상황지문 시간 텀 주고 한 줄씩 출력
	@Override
	void guidance() {
		System.out.println("당신은 지금 작은 방 안에 서 있습니다.");
		
		sleep(1000);
		
		System.out.println("침대와 사이드테이블이 당신 정면에 보이고, 테이블 위에는 빨간 꽃이 한송이 꽂혀 있는 화병이 보입니다.");
		
		sleep(1000);
		
		System.out.println("왼쪽으로는 하얀 커튼이 쳐진 창문이 있고, 커튼 너머에서 들어오는 햇살이 따듯하게 방을 비추고 있습니다.");
		
		sleep(1000);
		
		System.out.println("당신이 등지고 있는 벽쪽에는 문과 빌트인 옷장이 있습니다.");
	}

	// 부모에서 상속받아온 choice 오버라이드
	// 상황별 행동선택지 제공
	@Override
	public void choice() {
		// 3초 sleep
		sleep(3000);
		
		// 행동선택지
		System.out.println("===================================================================");
		System.out.println("[ 행동 선택지 ]");
		System.out.println("1. 커튼을 살펴봅니다.\n2. 꽃병을 살펴봅니다.\n3. 침대를 살펴봅니다."
				+ "\n4. 옷장을 살펴봅니다.\n5. 문을 살펴봅니다. \n6. 포기하기");
		
		// 선택지 한 번 진행 후 종료 여부를 결정하기 위해 do~while문 사용
		do {
			System.out.println("원하는 선택지의 번호를 입력해주세요.");
			System.out.print(">>>");
			// 입력값에 대한 에러 발생을 줄이기 위해 String 타입 사용
			String num = sc.next();	// 번호 입력
			
			// 번호에 따른 결과 도출을 위한 스위치문
			// String으로 받은 num을 int 타입으로 변경
			// 그 과정에서 num엥 담긴 값이 숫자가 아니면 에러가 나므로 예외처리해준다(continue)
			try {
				switch (Integer.parseInt(num)) {
				// 선택지별 지문 진행
				case 1:
					System.out.println("밖에는 빨간색 꽃밭이 펼쳐져 있습니다.");
					break;
					
				case 2:
					System.out.println("금방 물을 간 듯 화병에 물이 맺혀있습니다. 꽃 말고는 아무것도 없습니다. 바깥에서 꺾어온 꽃 같습니다.");
					break;
					
				case 3:
					while(true) {
						System.out.println("종이가 한 장 있습니다. 읽으시겠습니까? Y or N 입력");
						String a = sc.next();	// 선택 입력
						
						if(a.equalsIgnoreCase("Y")) {	// 대소문자 상관없이 받기 위해 equalsIgnoreCase 사용
							System.out.println("[미아를 위한 길 안내. 제가 지금 자리를 비워서 안내를 할 수 없습니다. "
									+ "\n문은 맨 끝에 있으니 그쪽으로 나가면 됩니다. 아주 간단하죠? 0_<]");
							break;	// break시 switch문을 나가 do~while문의 조건을 확인한다.
							
						} else if(a.equalsIgnoreCase("N")) {
							System.out.println("선택지로 돌아갑니다.");
							break;
							
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					break;
					
				case 4:
					System.out.println("옷장을 여니 은쟁반과 십면체로 된 초록색 주사위 2개, 파란색 주사위 2개가 있습니다.");
					
					// 행운스탯과 이성스탯 랜덤 지정을 위한 while문
					while(true) {
						System.out.println("주사위를 굴리시겠습니까? Y or N 입력");
						System.out.print(">>>");
						String a = sc.next();
						
						// 주사위 굴리기 선택 시
						if(a.equalsIgnoreCase("Y")) {
							int[] dice = new int[4];	// 주사위가 총 네 개이므로 네 개의 수를 랜덤하게 받아옴
							
							System.out.println("초록색 주사위를 굴립니다.");
							
							sleep(1000);
							
							for (int i = 0; i < 2; i++) {	// 초록색 주사위 : dice[0], dice[1]
								dice[i] = Util.getInstance().random(1, 50);	// 10~50까지의 수 랜덤 지정됨
								// 1번 주사위부터 출력될 수 있도록 i값에 +1
								System.out.println((i+1) +"번 주사위 : " + dice[i]);
								
								sleep(1000);
							}
							
							// LuckyPoint에 주사위 두 개 곱한 값을 넣어주고 출력
							setLuckyPoint(dice[0]+dice[1]);
							System.out.println("당신의 행운은 " + getLuckyPoint() + " 입니다.");
							
							sleep(1000);
							
							System.out.println();
							
							System.out.println("파란색 주사위를 굴립니다.");
							
							sleep(1000);
							
							for (int i = 2; i < 4; i++) {	// 파란색 주사위 : dice[2], dice[3]
								dice[i] = Util.getInstance().random(1, 50);	// 10~50까지의 수 랜덤 지정됨
								System.out.println((i+1) +"번 주사위 : " + dice[i]);
								
								sleep(1000);
							}
							
							// ReasonPoint에 주사위 두 개 곱한 값을 넣어주고 출력
							setReasonPoint(dice[2]+dice[3]);
							System.out.println("당신의 이성은 " + getReasonPoint() + " 입니다.");
							
							sleep(1000);
							
							// stats.txt에 저장하기
							int[] arr = {getLuckyPoint(), getReasonPoint(), getGatherKey()};
							String data = "";
							
							for (int i = 0; i < arr.length; i++) {
								// 행운스탯, 이성스탯, 열쇠개수를 불러와 각 값 뒤에 "/"를 넣어 data에 넣어준다.
								data += arr[i] + "/";
							}
							
							// data의 시작부분, 끝부분 지정
							data = data.substring(0, data.length()-1);
							
							try {
								// 속도 향상을 위해 FileWriter와 BufferedWriter 함께 사용(한다고 함)
								// "stats.txt", false > 덮어쓰기
								FileWriter fw = new FileWriter("stats.txt", false);
								BufferedWriter bw = new BufferedWriter(fw);
								// 위에서 받아온 data를 stats.txt에 저장
								bw.write(data);
								// 닫기
								bw.close();
							// 예외처리
							} catch (IOException e) {}
							
							break;
							
						} else if(a.equalsIgnoreCase("N")) {
							System.out.println("선택지로 돌아갑니다.");
							break;
							
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					break;
					
				case 5:
					// 문은 행운스탯과 이성스탯을 받기 전엔 열리지 않는다.
					if(getLuckyPoint() != 0 && getReasonPoint() !=0) {
						System.out.println("문이 열립니다.");
						setExit(1);	// exit : 게임 진행을 위한 지표
					} else {
						System.out.println("아직 문이 열리지 않습니다.");
					}
					break;
					
				case 6:
					// 부모에게서 받아온 포기하기 메서드
					giveUp();
					break;
					
				default:
					// 그 외 잘못 입력한 값에 대한 처리
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("[ERROR] 숫자만 입력해야 합니다!");
				continue;
			} catch (Exception e) {
				System.out.println("[ERROR] 알 수 없는 에러입니다. 관리자에게 문의하세요.");
				e.printStackTrace();
			}
		} while(getExit()<1);	// exit의 값이 설정되었을 경우 do~while문을 빠져나간다.
	}
}
