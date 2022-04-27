package othersproj;

import java.util.Random;
import java.util.Scanner;

public class Kiosk1_jhj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 관리자 메뉴 비밀번호 설정
		// 비밀번호는 보통 문자열로 한다
		// int 타입으로 하게되면 맨앞에 0이 왓을때 사라지기 때문에 문자열로 설정 (ex)0504,0123)
		// String ADMIN = "1234"; //변수를 대문자로 설정하면 변경되면 안된다는걸 표현(회사마다 다름)
		// final : 변수를 상수로 만들어주는(상수화) 제어 , 변수값을 변경하려 할때 오류로 알려줌, 변수값 변경 불가
		final String ADMIN = "1234";
		
		int hamCnt = 0; // 햄버거 총 갯수를 저장할 변수
		int colaCnt = 0; // 콜라 총 갯수를 저장할 변수
		int gamCnt = 0; // 감튀 총 갯수를 저장할 변수
		
		System.out.println("환영합니다 오늘도 힘내세요");
						
		while(true) { // true자리에 조건식 가능 자유
			System.out.println("1.주문하기");
			System.out.println("2.관리자메뉴");
			System.out.print(">>> ");
			// 관리자 메뉴에서 nextLine을 사용해야 하기때문에 nextInt가 여기서 쓰이면 문제가 발생
			// 대신 Integer.parseInt를 사용하여 nextLine을 int타입으로 바꿔주기 
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				// 주문하기
				hamCnt = 0; // 다음손님을 위한 리셋
				colaCnt = 0;
				gamCnt = 0;
				
				while(true) {
					System.out.println("-----메뉴판-----");
					System.out.println("1. 햅버거 : 2500원");
					System.out.println("2. 콜   라 :  300원");
					System.out.println("3. 감자튀김 : 1000원");
					System.out.println("4. 결제하기");
					System.out.println(" >>> ");
					choice = Integer.parseInt(sc.nextLine());
					if(choice == 1) {
						hamCnt++;
						System.out.println("햄버거 한 개가 추가되었습니다");
					}else if(choice == 2) {
						colaCnt++;
						System.out.println("콜라가 한 개가 추가되었습니다");	
					}else if(choice == 3) {
						gamCnt++;
						System.out.println("감자튀김이 한 개가 추가되었습니다");
					}else if(choice == 4) {
						// 결제하기
						int totalCost = hamCnt*2500 + colaCnt*300 + gamCnt*1000;
						
						System.out.println("총 금액은 " + totalCost + "원 입니다");
						System.out.print("결제 금액 : "); // 손님이 넣을 돈 입력하는 곳
						int money = Integer.parseInt(sc.nextLine());
						
						if(money >= totalCost) {
							// 결제진행
							System.out.println("결제과 완료되었습니다");
							System.out.println("잔돈 : " + (money - totalCost) + "원이 반환되었습니다");
							
							System.out.println("드시고 가신다면 예 라고 입력하시오");
							String input = sc.nextLine();
							if(!input.equals("예")) {
								// 포장선택시 랜덤으로 대기번호 발송
								// 001 ~ 999 까지 중 랜덤으로 보여주기
								System.out.printf("%03d번 입니다\n", r.nextInt(999) + 1);
								break; // 결제가 끝낫기 때문에 다음 손님을 위헤 다시 메인메뉴 while문으로 이동
							}else {
							// 매장 선택시 바로준다
								System.out.println("음식이 나왔습니다 매장에서 드세요");
								break; // 결제가 끝낫기 때문에 다음 손님을 위헤 다시 메인메뉴 while문으로 이동
								}
						}else {// 잔액부족
							System.out.println("잔액이 부족합니다 다시 주문화면으로 돌아갑니다");
							continue; // 결제하기 창에서 장바구니가 안보이게 하기 위해, whlie문으로 간다(즉시 다음반복진행)
						}
						
						
					}else {
						System.out.println("다시 입력해 주세요");
					}
					
					System.out.println("---현재 장바구니---");
					System.out.println("햄버거 : " + hamCnt + "개  -- " + hamCnt*2500 + "원");
					System.out.println("콜라 : " + colaCnt + "개  -- " + colaCnt*300 + "원");
					System.out.println("감자튀김 : " + gamCnt + "개  -- " + gamCnt*1000 + "원");
					System.out.println("총 금액 : " + (hamCnt*2500 + 
							colaCnt*300 + gamCnt*1000) + "원");
					System.out.println(); // 줄바꿈
					
				}
			}else if(choice == 2) {
				// 관리자 메뉴
				System.out.println("관리자 코드 : ");
				String code = sc.nextLine();				
				
				// 만일 관리자 비밀번호가 맞게 입력되었다면 프로그램 종료(while문 탈출)				
				if(ADMIN.equals(code)) {// 관리자 비밀번호가 입력받은 값과 같다면
					System.out.println("시스템을 종료합니다");
					break;
				// 아니라면 다시 메인 메뉴로 이동
				}else {	
					System.out.println("비밀번호가 틀렸습니다 메인으로 이동합니다");
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println(); // 엔터키능 출력창의 디자인을 위해 입력
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
