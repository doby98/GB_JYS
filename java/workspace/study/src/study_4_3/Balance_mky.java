package study_4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 글이나 수학식을 표현하기위해 괄호 (ex. { , [, (  ) 등을 많이 사용한다.
 * 보통 열린 괄호가 ( 가 있으면 순서에 맞게 닫힌 괄호가 있어야 하는데 이것을 우리는 균형잡힌 괄호(balanced parentheses)라고 얘기한다.
 * 즉 [()]{}{[()()]()} 표현식은 열린, 닫힌 괄호들이 균형잡힌 형태로 표현된것이고,
 * (]) 는 ']'에 대한 열린 괄호가 가 없기 때문에 균형잡힌 형태라고 볼 수 없다.
 * 
 * <Examples of balanced expression>
 * (())
 * {(([]))}
 * {{}}[]
 * [](){}
 * {{}}{}()[]
 * 
 * <Examples of unbalanced expression>
 * {()
 * [][])
 * }}}}
 * ((()
 * [{](){}
 * 
 * <샘플 입력>
 * {}()
 * ({()})
 * {}(
 * []
 * 
 * <샘플 출력>
 * true
 * true
 * false
 * true
 */

// arraylist 이용해서 풀어보기..

public class Balance_mky {
	
	List<String> pareList = new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	
	private String pare;
	
	public void inner() {
		boolean flag = true;
		
		while(flag) {
			this.pareList.clear();
			System.out.println("괄호를 입력하시오 , q는 종료");
			this.pare = sc.nextLine();
			
			if( this.pare.equalsIgnoreCase("q")) {
				System.out.println("입력을 종료합니다.");
				flag = false;
				break;
			}
			
//			System.out.println(this.pare);
			
			for( int i = 0; i < this.pare.length(); i++ ) {
				String par = String.valueOf(this.pare.charAt(i));
				
				if( par.equals("(") || par.equals("{") || par.equals("[") ) {
					this.pareList.add(par);
				} else if( par.equals(")") ) {
					if( this.pareList.size() != 0 && this.pareList.get(this.pareList.size() - 1).equals("(") ) {
						this.pareList.remove(this.pareList.size() - 1);
					} else {
						this.pareList.add(par);
					}
				} else if( par.equals("}") ) {
					if( this.pareList.size() != 0 && this.pareList.get(this.pareList.size() - 1).equals("{") ) {
						this.pareList.remove(this.pareList.size() - 1);
					} else {
						this.pareList.add(par);
					}
				} else if( par.equals("]") ) {
					if( this.pareList.size() != 0 && this.pareList.get(this.pareList.size() - 1).equals("[") ) {
						this.pareList.remove(this.pareList.size() - 1);
					} else {
						this.pareList.add(par);
					}
				} else {
					System.out.println("괄호가 아닌 문자를 입력했습니다!");
				}
			}
			
			this.test();
			System.out.println();
		}
			
	}
	
	public void test() {
		
		if( this.pareList.size() == 0 ) {
			System.out.println("true( 균형 잡힌 괄호 )");
		} else {
			System.out.println("false( 불균형한 괄호 )");
		}
	}
	
}
























