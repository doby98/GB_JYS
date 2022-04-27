package othersproj;
 
/**
 * @작성자 문기연
 * @date 22-03-21 ~ 22-04-03
 * @프로젝트명 방탈출게임
 * @BGM We Always Thought the Future Would Be Kind of Fun by Chris Zabriskie
 * 		Source: http://chriszabriskie.com/darkglow/
 * 		Artist: http://chriszabriskie.com/
 */

public class PlayGame {

	public static void main(String[] args)  {
		
		// BGM 객체 생성 및 사용
		PlayMusic music = new PlayMusic();
		while(true) {	// while문 범위 지문 전체로 설정
			try {
				music.abc();
			} catch(Exception e) {
				
			}
		
		// 게임 타이틀 객체 생성 및 사용
		Title t = new Title();
		t.title();
		
		// 안내자 타이틀 객체 생성 및 사용
		Who who = new Who();
		who.sayWelcome();

		// 게임 화면 전환을 위한 로딩 객체 생성 및 사용
		Loading load = new Loading();
		load.loading();
		
		// 시간 체크 시작
		long startTime = System.currentTimeMillis();

		// 시작 방 객체 생성 및 사용
		ChoiceStartRoom sr = new ChoiceStartRoom();
		sr.guidance();	// 지문
		sr.choice();	// 선택
		
		// 각 선택지가 끝날 때마다, 포기(getExit()값 ==2)할 경우 System.exit(0)으로 게임 종료
		if(sr.getExit()==2) {	// exit 값이 2와 같다면 게임 종료
			System.exit(0);
		}
		
		load.loading();
		
		// 주 선택지들 객체 생성
		ChoiceCorridor cc = new ChoiceCorridor();
		ChoiceDoor cd = new ChoiceDoor();
		ExitDoor ed = new ExitDoor();
		ChoiceRoom1 cr1 = new ChoiceRoom1();
		ChoiceRoom2 cr2 = new ChoiceRoom2();
		ChoiceRoom3 cr3 = new ChoiceRoom3();
		
		cc.guidance();

		// 선택지들 간 반복을 위해 while(true) 설정
		while(true) {
			cc.choice();

			if(cc.getExit()==2) {
				System.exit(0);
			}
			
			System.out.println();
			System.out.println("· ─────── ·𖥸· ─────── · ─────── ·𖥸· ─────── · ─────── ·𖥸· ─────── ·");

			// standardNum에 대한 switch문
			// standardNum 2:문 > 1번 방, 3:문 > 2번 방, 4:문 > 3번 방
			switch(Integer.parseInt(cc.standardNum)) {
			case 2:
				// 한 번 들어갔던 문은 복도 행동 선택지로 돌려보낸다.
				if(cr1.isFlag()) {
					System.out.println("앗, 이 방은 이미 열쇠를 획득한 방 입니다. 선택지로 돌아갑니다.");
					continue; // while로 돌아간다.
				}
				
				cd.guidance();
				cd.choice();
				
				load.loading();
				
				// cd 참조변수에 대한 getExit 값 판별
				if(cd.getExit()==2) {
					System.exit(0);
				} else if(cd.getExit()==5) {
					continue;
				} else {	// cd.getExit()==1인 경우
					cr1.guidance();
					cr1.choice();
					
					load.loading();
					
					// cr1 참조변수에 대한 getExit 값 판별
					if(cr1.getExit()==2) {
						System.exit(0);
					} else if(cr1.getExit()==4) {
						break;
					} else if(cr1.getExit()==5) {continue;}
					break;
				}

			// 이하 동일한 구조
			// 반복되는 코딩을 줄여보려 했으나 에러가 계속 나서 포기;ㅅ;
			case 3:
				if(cr2.isFlag()) {
					System.out.println("앗, 이 방은 이미 열쇠를 획득한 방 입니다. 선택지로 돌아갑니다.");
					continue;
				}
				
				cd.guidance();
				cd.choice();
					
				load.loading();
				
				if(cd.getExit()==2) {
					System.exit(0);
				} else if(cd.getExit()==5) {
					continue;
				} else {
					cr2.guidance();
					cr2.choice();
					
					load.loading();
					
					if(cr2.getExit()==2) {
						System.exit(0);
					} else if(cr2.getExit()==4) {
						break;
					} else if(cr2.getExit()==5) {continue;}
					
					break;
				}
				
			case 4:
				if(cr3.isFlag()) {
					System.out.println("앗, 이 방은 이미 열쇠를 획득한 방 입니다. 선택지로 돌아갑니다.");
					continue;
				}
				
				cd.guidance();
				cd.choice();
				
				load.loading();
				
				if(cd.getExit()==2) {
					System.exit(0);
				} else if(cd.getExit()==5) {
					continue;
				} else {
					
					cr3.guidance();
					cr3.choice();
					
					load.loading();
					
					if(cr3.getExit()==2) {
						System.exit(0);
					} else if(cr3.getExit()==4) {
						break;
					} else if(cr3.getExit()==5) {continue;}
					
					break;
				}
			}	// switch문 끝
			
			// 열쇠가 3개 다 모였을 때 나갈 수 있음
			if(cr1.getGatherKey()==3 || cr2.getGatherKey()==3 || cr3.getGatherKey()==3) {
				break;
			}
			
		}	//switch문 포함된 while문 끝
		
		ed.guidance();
		
		ed.choice();
		
		who.sayGoodBye();
		
		load.loading();
		
		// 엔딩 객체 생성 및 사용
		Ending end = new Ending();
		end.ending();
		
		// 시간 체크 끝
		long endTime = System.currentTimeMillis();
		// 끝 시간과 처음 시간을 빼고 분과 초로 나누어 플레이어의 기록을 출력
		System.out.println("당신의 기록 : " + ((endTime-startTime)/1000)/60 + "분" + ((endTime-startTime)/1000)%60 + "초");
		
		break;	// music 메소드 사용한 while문 나가기
        }	
	}
}
