package study_wkd3;

import java.util.Scanner;

/* while문제
  * 
  * 숫자를 입력받아 선택한 번호에 해당하는 메세지를 출력하는 작업 실행 
  * ->	숫자 입력받는 코드 num = sc.nextInt();
  * 4가 입력되면 메세지 출력 후 종료하는 프로그램 작성
  * 1~4 이외의 숫자가 입력되면 '잘못 선택하였습니다.' 출력
  * ex : 1.입력하기 / 2.출력하기 / 3.삭제하기 / 4.끝내기
  * 	  번호를 입력해주세요. (3을 선택했을 경우 )
  * 	-> 삭제하기를 선택하였습니다. 가 나와야함
  */

 
public class While_print {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int num = 0; 
        
    	while (num != 4) {
    		System.out.println("메뉴를  선택하여 주십시오.");
    		System.out.println("1. 입력하기 | 2. 출력하기 | 3. 삭제하기 | 4. 끝내기  >>");
    		num = sc.nextInt();
    		
    		switch (num) {
    		
    		case 4:
    			System.out.println("끝내기를 선택하였습니다. 프로그램을 종료합니다.");
    			break;
    			
    		case 3:
    			System.out.println("삭제하기를 선택하였습니다.");
    			break;
    			
    		case 2:
    			System.out.println("출력하기를 선택하였습니다.");
    			break;
    			
    		case 1:
    			System.out.println("입력하기를 선택하였습니다.");
    			break;
    			
    		default:
    			System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
    		}
    	}
    	
    	sc.close();
    	
    }
}