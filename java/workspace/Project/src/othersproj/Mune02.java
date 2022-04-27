package othersproj;

// 자식 행동구현소

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mune02 extends Mune_list implements Mune01{
	ArrayList<Mune_list> ar = new ArrayList<>(); // , 정보저장클래스 ,클래스 정보를 담아서 가져올수있다 
	Scanner sc =  new Scanner(System.in); // , 입력받기
	Random rd = new Random();
	
	
	
	@Override
	public void saveWorker() { //회원 한명의 정보 전달 메서드
	String name;   // 회원이름
	String pone;   // 연락처 or 날짜	
	int age;	   // 회원번호
	String helth;  // 운동종류	
	String number; // 횟수
	
	Mune_list mu = new Mune_list();
	
	System.out.println(" 회원님의 이름을 입력해주세요 : ");
	System.out.println(">>>>");
	name = sc.nextLine();
	System.out.println(" 기록날짜를 입력해주세요 ex)22/03/23 : ");
	System.out.println(">>>>");
	pone = sc.nextLine();
	System.out.println(" > 회원님의 번호를 출력중입니다. < ");
//	age = sc.nextLine(); // 수동입력은 이걸활성화
	age = rd.nextInt(100); // 랜덤은 이걸활성화
	System.out.println(" 기록하실 운동종목을 적어주세요 : ");
	System.out.println(">>>>");
	helth = sc.nextLine();
	System.out.println(" 진행하실 운동의 반복횟수를 적어주세요 : ");
	System.out.println(">>>>");
	number = sc.nextLine();
	
	mu.setName(name);
	mu.setPone(pone);
	mu.setAge(age);
	mu.setHelth(helth);
	mu.setNumber(number);
	ar.add(mu); // ArrayList에 값 추가해주는 메서드; 
	System.out.println("!★ 등록이 완료되었습니다 ★!");
	System.out.println( );
	System.out.println("!★ 앞으로도 화이팅입니다. ★!");
	System.out.println( );
	
	}
	
	//연산
	@Override
	public void modify() {//수정
        System.out.println("수정할 회원의 이름을 입력 하세요 : ");
        String listName = sc.next();
        boolean flag = true;
        for (int i = 0 ; i < ar.size(); i++) {
            if (ar.get(i).getName().equals(listName)) {
                flag = false;
                System.out.println("변경날짜 입력 : ");
                String modiJobRank = sc.next();
                ar.get(i).setPone(modiJobRank);
                System.out.println("변경번호 입력 : ");
                int modiSalary = sc.nextInt();
                ar.get(i).setAge(modiSalary);
                System.out.println("변경 운동종류 입력 : ");
                String modiBounus = sc.next();
                ar.get(i).setHelth(modiBounus);
                System.out.println("변경 운동횟수 입력 : ");
                String modinum = sc.next();
                ar.get(i).setNumber(modinum);
                System.out.println("수정이 정상적으로 완료되었습니다.");
                break;
            }
        }
        if (flag) {
            System.out.println("해당 회원이 없습니다.");
        }
        
    }
	@Override
	public void search() { //이름 값 으로 해당 값을 가진 회원찾기 & 해당 값 출력 메소드
		System.out.println(" 찾으시는 회원 이름을 입력하세요 : ");
		System.out.println(">>>>");
		String listName = sc.nextLine();
		boolean fiag = true;
		for( int i =0; i <ar.size(); i++) {
			if(ar.get(i).getName().equals(listName)) {
				fiag = false;
				System.out.println(" 이름 : " + ar.get(i).getName());
				System.out.println(" 날짜 : " + ar.get(i).getPone());
				System.out.println(" 번호 : " + ar.get(i).getAge());
				System.out.println(" 종목 : " + ar.get(i).getHelth());
				System.out.println(" 횟수 : " + ar.get(i).getNumber());
				break;
			}
	}
		if (fiag) {
			System.out.println("해당 회원이 없습니다. ");
		}
	}
	
	//출력
	
	@Override
	public void outputTitle() {}; //출력되는 정보들의 타이틀 출력 메소드
	
	@Override
	public void output() { //모든 직원의 정보 출력 메소
		System.out.println("==========모든 회원정보 출력==========");
        System.out.println("---------------------------------");
        System.out.println("| >이름< | >날짜< | >번호< | >종목< | >횟수< |");
        System.out.println("----------------------------------");
        for(int i = 0; i < ar.size(); i++) {
        	System.out.println("| " + ar.get(i).getName() + " | " + ar.get(i).getPone()        			
        			+ " | " + ar.get(i).getAge() + "번 | " + ar.get(i).getHelth()
        			+ " | " + ar.get(i).getNumber() + " |");
        }
	
	}
	public void delete() {
		while(true) {
			System.out.println(" 삭제하실 이름을 선택하세요,(q:메인화면)");
			System.out.println(">>>>");
			do {
				try {
					String name = sc.nextLine();
					
					if(!name.equalsIgnoreCase("q")) {
						int length = ar.size();
						boolean fiag = false;
						 for(int i=0; i < length; i++) {
                             Mune_list mt = (Mune_list)ar.get(i);
                             if(name.equals(mt.getName())) { // 입력한값을 슈퍼클래스에서조회
                                   fiag = true;  // 일치내용이 있으면
                                   ar.remove(i); // 해당 ar의 내용을삭제
                                   break; 
                             }
                       } 

                       if(fiag) {
                             System.out.println("삭제되었습니다."); // 트루가되면 성공했습니다
                       } else {
                             System.out.println("일치하는 데이터가 없습니다."); // 없으면 없어
                       }
                       break;
                 } else {
                       return;                        
                 }
           } catch(Exception e) {
                 System.out.println("입력오류입니다. 다시 입력해 주세요.");
                 break;
           }
     } while(true);
			break;

		} 

	}       			
	
}