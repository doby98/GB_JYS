package othersproj;

import java.util.Scanner;

// 게임 공통요소를 위한 부모클래스(추상클래스)
public abstract class ForChoice  {
	// 행운스탯
	private int luckyPoint;
	// 이성스탯
	private int reasonPoint;
	// 키 개수
	private int gatherKey;
	
	// 게임 진행 여부를 판단하는 키
	private int exit;
	
	// 들어갔던 문 판단
	private boolean flag = false;

	// gatter, setter
	int getLuckyPoint() {
		return luckyPoint;
	}

	void setLuckyPoint(int luckyPoint) {
		this.luckyPoint = luckyPoint;
	}

	int getReasonPoint() {
		return reasonPoint;
	}

	void setReasonPoint(int reasonPoint) {
		this.reasonPoint = reasonPoint;
	}

	int getGatherKey() {
		return gatherKey;
	}

	void setGatherKey(int gatherKey) {
		this.gatherKey = gatherKey;
	}
	
	int getExit() {
		return exit;
	}
	
	boolean isFlag() {
		return flag;
	}

	void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	void setExit(int exit) {
		this.exit = exit;
		// exit 1 = main에서 추가 작업 진행
		// exit 2 = main에서 게임 종료
		// exit 3 = 자식클래스 내에서 필요한 지문 재실행
		// exit 4 = 마지막 문으로 가기
		// exit 5 = 이전 지문으로 가기
	}
	
	// 스레드와 연결되어 잠시 잠시 멈추는 기능
	void sleep(int time) {
		try {
			Thread.sleep(time); // time만큼 대기
		} catch (InterruptedException e) {}
	}

	// 추상메소드
	// 게임 스테이지 별 필수 메소드
	abstract void guidance();
	abstract void choice();
	
	// 부모 클래스에서 스캐너 생성 > 자식 클래스까지 영향을 줌
	Scanner sc = new Scanner(System.in);
	
	// 포기하기 메서드
	void giveUp() {
		System.out.println("포기하기. 영원히 꿈에 갖히시겠습니까? Y or N");
		System.out.print(">>>");
		String a = sc.next();
		
		if(a.equalsIgnoreCase("Y")) {
			System.out.println("당신은 영원히 꿈에 갖혔습니다.");
			System.out.println("GAME OVER");
			System.exit(0);
			
		} else if(a.equalsIgnoreCase("N")) {
			System.out.println("선택지로 돌아갑니다.");
			return;
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 노이즈 메서드
	void noise() {
		// 그림 아스키코드변환 사이트를 이용하여 출력
		System.out.println("!*$#;:.~!$*:-~!=!::~!!!;;::::::::::::;;;:::::!*$$*:-,,,,-~~-;#$-,;$!*!::-;!=;~-!*=:~,~!!*===***!!!**\r\n" + 
				";.  ,#@@~  =@=. !@#~ .:$@@#$=====$#@@@@@#=!~,:;*;:!!;--!@#!. ,*@@$-  ,=@@*  ~@@~ .*@@=-     .,,,.   \r\n" + 
				"~;$$**-,~$$:.~*;,~==;~:!!!!!!!!!!!!;;;*=*;;~-,-~;==**;~~:!=*==!::~:$#@=:--;*!:~:*=!~~~;*******!**==$\r\n" + 
				"~=*~,~~:::-,...~!$#@@!:,..,-:;!!!!:, .-;=##$$=$=$$*!;----:~=; .-:;;;:~--,..;$$:=:.-;*##$=*!;:-..,~!#\r\n" + 
				"!$=-*:;;;*:,~=##*~,,,,:!=$$$$$$$#$$$$$$!;-..,,,,,,,-:!#;;=,-=$$=*!!!*$$$$$$*-,:$*~=*!===$#@@@@#*:..~\r\n" + 
				"*!!;:;*,=-=~;#~,;*!;:;!!!!!!!:-,-,-:!!!!*****;::::;!!*-=~~!=!!;;!!!*!!!!!!:~:::;!=!-:$;~!$#=**=$#$!~\r\n" + 
				"  ~$*!*=~!$-@-:@:.-#@$~    ~=$#@@@#$*,    .-:$@@@$;!:$;,@$-  ,---,      .;=#@@$-  =@#, ;#@*-.    .-:\r\n" + 
				"*;~;=#$!:~!*.:*-;**~~:!**$*;~~~~~~~~:;=****=;-.-;!*,*~*-,!=!;~:!$===****!::~~~:!**~~~***~-~;=***=*!:\r\n" + 
				"$!--------$$=;-:~**~-;==!~-----------~:==!-~=:!;-=:!#*~.....,:*#@*-~!==$!::----!*=$;-,:!!~:*##=!:. .\r\n" + 
				" ..~;*;:,..  *#:~.,=#;..:$#####$$####$:.-#:!!~$,$!,.~*#####@#!~,...!=#=~-,~::::~-:!$#$=!-...,~:=####\r\n" + 
				"=@#$!!*$#@@$;;,~;;$-;:;;!;;;;:;;!!;;~-$!:=~!::#~,;;::~,....-~:;;;;;*!!;;;;;;;;;:::;~~~;;;;;;;:~-,.~;\r\n" + 
				"...      ..,=@@#*..;@:#$-....,,. .-$=-=~$-~#; ~$####@@@@@@######$~,. ..........,,---:!=#########@@@@\r\n" + 
				"-~;*$$*;:~~-.  ;*=$!-:!,$======$#;-*:!~!:=,;$$;-----------.  ,;!*================****!!!;;:~,    ..-\r\n" + 
				"@#=!!*$#@@@@$==*~ ,-~:*=$,,:!- :#,!::!*-$#!-.-~------~*#@@$==*==*;-..  ..-!=======================$@\r\n" + 
				"  ...       :$###@@@=-....!$##==:!;*~$.,!@@@@@@#####!-,....  .!$##########$*:,       .,-~:;;;:-.    \r\n" + 
				"*#@@@$*!;;;;~.   .~:;;;;;;!*@$,~*,!:*:~~!$$==*~..:;!!;;;;*#*!;;;;;:~-~:;;;;;;;;!!!!!!;;;;;;;;;;;;;;;\r\n" + 
				"......:#@@@@@#############!.-#,:~$-$,*$,,-::~,,*!:=!.~$##:,....-*######*,...,,,,,,........~*#######=\r\n" + 
				"$*~~----.    .~!****;-,--,*#.;-!::!~$~~:,.,!*~-*$-;*~!*;,-*$#=*-,,---,,;$$#**!;~~*=$#===;~~---------");
	}	
	
}