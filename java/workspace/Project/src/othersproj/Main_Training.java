package othersproj;

import java.util.ArrayList;


import java.util.Calendar;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;

// 운동기록프로그램
/*
 * 필요한것.
 * 1. 메인화면에서 버튼 카테고리생성
 * 2. 입력받을 버튼에관한 메서드 구성
 * 3. 입력 및 삭제가능하기위해 생성자활용?
 * 4.
 */

public class Main_Training {
	static ArrayList ary = new ArrayList(); 
	public static void main(String[] args) {
		Mune02 m2 = new Mune02(); // 주요 움직임장치
		
		Scanner input = new Scanner(System.in);
		
        while(true) { // 종료하기전에는 무한하게돌도록 설정
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 리스트출력");
            System.out.println("3. 회원 정보수정");
            System.out.println("4. 회원 검색");
            System.out.println("5. 회원 정보삭제");
            System.out.println("6. 시스템 종료");
            System.out.print(">>>");
            int select = input.nextInt();
            switch (select) { // 선택지를 고르며 케이스를 선택시 해당 메서드를 호출하여 이곳은 브레이크된다.
            case 1:
                m2.saveWorker();
                break;
            case 2:
                m2.output();
                break;
            case 3:
                m2.modify();
                break;
            case 4:
                m2.search();
                break;
                
            case 5:
            	m2.delete();
            	break;
            	
            case 6:
                System.exit(0);
                
            default:
                System.out.println("잘못된 입력");
                break;
            }
        }
     	}
	

 
	}
//}


