package othersproj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChoiceRoom3 extends ForChoice {
	
	@Override
	void guidance() {
		System.out.println("당신은 새로운 방에 들어왔습니다. 부엌인 것 같습니다.");
		
		sleep(1000);
		
		System.out.println("아일랜드형 식탁이 왼쪽 벽에 붙어있고 정면 벽쪽으로 개수대와 찬장이, 오른편에 냉장고가 있습니다.");
		
		sleep(1000);
		
		System.out.println("뒤에는 당신이 들어온 문이 있습니다.");
	}
	
	@Override
	public void choice() {
		sleep(3000);
		
		System.out.println("===================================================================");
		System.out.println("[ 행동 선택지 ]");
		System.out.println("1. 식탁을 살펴봅니다.\n2. 개수대와 찬장을 살펴봅니다.\n3. 냉장고를 살펴봅니다."
				+ "\n4. 복도로 나가기.\n5. 포기하기");
		
		// 선택지 한 번 진행 후 종료 여부를 결정하기 위해 do~while문 사용
		do {
			System.out.println("원하는 선택지의 번호를 입력해주세요.");
			System.out.print(">>>");
			String num = sc.next();	// 번호 입력
			
			// 번호에 따른 결과 도출을 위한 스위치문
			try {
				switch (Integer.parseInt(num)) {
				case 1:
					System.out.println("하얀색 식탁 위에 라면과 유자차가 놓여있습니다. 둘다 향이 아주 향긋하네요. "
							+ "\n배가 고파지지만 먹을 시간이 없습니다..."
							+ "\n라면과 유자차 사이에는 비어있는 과일 바구니가 놓여있습니다.");
					break;
					
				case 2:
					System.out.println("개수대는 물기 하나 없이 깔끔합니다. 찬장 안 식기는 다 뒤집어져 있네요.");
					break;
					
				case 3:
					System.out.println("냉장고 안 과일칸에서 자물쇠 달린 작은 상자를 발견합니다. "
							+ "\n비밀번호를 입력하시겠습니까 ? Y or N");
					System.out.print(">>>");
					String a = sc.next();
					
					if(a.equalsIgnoreCase("Y")) {	// 대소문자 상관없이 받기 위해 equalsIgnoreCase 사용
						while(true) {
							System.out.println("정답을 공백없이 입력해주세요. 선택지로 돌아가고 싶으시면 q를 입력해주세요");
							
							String b = sc.next();
							
							if(b.trim().equals("수박")) {
								System.out.println("열쇠를 획득했습니다.");
								
								// 행운 스탯, 이성 스탯, 열쇠 갯수 불러오기
								String[] arr1 = null;
								String data = "";
								try {
									File file = new File("stats.txt");
									if(file != null) {
										FileReader fr = new FileReader(file);
										BufferedReader br = new BufferedReader(fr);
										data = br.readLine();
										fr.close();
										br.close();
										arr1 = data.split("/");
									}
								} catch (Exception e) {}
								
								int[] arr2 = new int[3];
								for (int i = 0; i < arr1.length; i++) {
									arr2[i] = Integer.parseInt(arr1[i]);
								}
								
								setLuckyPoint(arr2[0]);
								setReasonPoint(arr2[1]);
								setGatherKey(arr2[2]);
								
								setGatherKey(getGatherKey() + 1);	// 열쇠 획득 시 추가됨
								System.out.println("===================================================================");
								System.out.println("현재 열쇠 개수 : " + getGatherKey());
								System.out.println("===================================================================");
								
								if(getGatherKey() == 3) {	// 열쇠를 3개 모으면 출구로 넘어감
									System.out.println("열쇠를 모두 찾았습니다! 마지막 문으로 이동합니다.");
									setExit(4);	// 출구로 가는 종료번호
								} else {
									System.out.println("복도로 이동합니다.");
									setFlag(true);	// 한 번 들어갔던 방의 flag는 true
									setExit(5);
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

								break;
								
							} else if(b.trim().equalsIgnoreCase("q")){
								System.out.println("선택지로 돌아갑니다.");
								setExit(0);
								break;
								
							} else {
								System.out.println("틀렸습니다.");
								continue;
							}
						}
						break;
						
					} else if(a.equalsIgnoreCase("N")) {
						System.out.println("선택지로 돌아갑니다.");
						setExit(0);
						break;
						
					} else {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
					
				case 4:
					System.out.println("복도로 이동합니다.");
					setExit(5);
					
					break;
					
				case 5:
					giveUp();
					break;
					
				default:
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
