package othersproj;

	public class ChoiceCorridor extends ForChoice {
		// 자식클래스들은 공통된 구조를 갖는다.
		
		// 메인 클래스에서 지표로 삼을 멤버변수
		String standardNum;

		@Override
		void guidance() {
			System.out.println();
			System.out.println("당신은 긴 복도로 나왔습니다.");
			
			sleep(1000);
			
			System.out.println("오른쪽으로는 간간히 창문이 있고 방에서 보았던 똑같은 하얀 커튼이 쳐져 있습니다.");
			
			sleep(1000);
			
			System.out.println("왼쪽으로는 방이 있는 것 같습니다. 다만 문이 세개씩 나란히 있습니다.");
			
			sleep(1000);
			
			System.out.println("총 9개의 문이 있군요. 로마자로 I, II, III라고 음각된 금패가 문 세개마다 위에 붙어있습니다.");
			
			sleep(1000);
			
			System.out.println("그리고 복도 끝 정면에도 문이 하나 보이는 것 같습니다.");
			
			sleep(3000);
		}

		@Override
		public void choice() {
			System.out.println("===================================================================");
			System.out.println("[ 행동 선택지 ]");
			System.out.println("1. 복도를 가로질러 정면의 문을 살펴봅니다.\n2. I 문을 살펴봅니다.\n3. II 문을 살펴봅니다."
					+ "\n4. III 문을 살펴봅니다.\n5. 커튼을 살펴봅니다. \n6. 포기하기");
			
			do {
				System.out.println("원하는 선택지의 번호를 입력해주세요.");
				System.out.print(">>>");
				standardNum = sc.next();
				
				try {
					switch (Integer.parseInt(standardNum)) {
					case 1:
						System.out.println("문이 열리지 않습니다. 열쇠 구멍이 총 세 개 보입니다.");
						break;
						
					case 2:
						System.out.println("선택한 문 앞으로 이동합니다.");
						setExit(1);
						standardNum = "2";
						break;
											
					case 3:
						System.out.println("선택한 문 앞으로 이동합니다.");
						setExit(1);
						standardNum = "3";
						break;
						
					case 4:
						System.out.println("선택한 문 앞으로 이동합니다.");
						setExit(1);
						standardNum = "4";
						break;
						
					case 5:
						System.out.println("창 밖으로 빨간 꽃밭이 보입니다.");
						setExit(0);
						break;
						
					case 6:
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
				
			} while(getExit()<1);
		}
}

