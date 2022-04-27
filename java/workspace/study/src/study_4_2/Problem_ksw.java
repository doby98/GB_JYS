package study_4_2;

import java.util.Arrays;

/*
 * [그림]과 같이 4개의 슈트(모양: S, D, H, C)와 13개의 랭크(값 : A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K)로 
 * 구성된 52장의 카드가 있다. 
 * S = 스페이드  D = 다이아  H = 하트  C = 클로버
 * 첨부된 [그림] 참조
 * 52장의 카드에서 임의의 5장의 카드를 주었을 때 카드 핸드(선택된 5장의 카드)의 종류가 9종류가 있다. 아래는 9종류의 카드 핸드를 설명한다. 
 *
 * 1. Straight Flush : 모두 동일한 슈트에 랭크(값)가 모두 연속적이다
 * (여기서는 로얄 플러쉬를 포함한다. 로얄 플러쉬는 모두 동일한 슈트에 T, J, Q, K, A를 갖는다).
 * 2. Four of a Kind : 5장 중 4개의 랭크(값)가 모두 같다.
 * 3. Full House : 3장의 동일한 랭크(값)와 다른 랭크(값)의 동일한 2장으로 구성된다.
 * 4. Flush : 5장이 모두 동일한 슈트다.
 * 5. Straight : 다른 슈트가 섞여있으며 랭크(값)가 모두 연속적이다.
 * 6. Three of a kind : 동일한 랭크(값)가 3장이다(1,2,3,3,3).
 * 7. Two pair : 동일한 랭크(값) 2장씩 두개의 랭크다(2,6,6,3,3).
 * 8. One pair : 동일한 랭크가 2장이다(2,4,5,5,7).
 * 9. High card : 1~8번에 해당하지 않는다.  
 * 
 * 예시) 입력 - S5 S6 S7 S8 S9 
 * 		출력 - Straight Flush다. 
 * 
 * <입력방법 >
 * 첫 줄에는 테스트 케이스가 개수다.(생략가능)
 * 두 번째 줄부터는 5개의 카드가 공백과 함께 주어진다. 
 * 
 * 
 * 출처 - https://swexpertacademy.com/main/main.do
 * 		SW ExpertAcademy 9760. Poker Game
 * 
 */
public class Problem_ksw {
	private final String[] POKER_NUM = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	private final String[] POKER_SUIT = {"S", "H", "D", "C"};
	
	private int[] hand_num = new int[this.POKER_NUM.length];
	private int[] hand_suit = new int[this.POKER_SUIT.length];
	
	private String[] card_hand = {"SK", "SA", "ST", "S5", "S9"};
	
	private String result = "";

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String[] getCard_hand() {
		return card_hand;
	}
	
	public int[] getHand_num() {
		return hand_num;
	}

	public void setHand_num(int[] hand_num) {
		this.hand_num = hand_num;
	}

	public int[] getHand_suit() {
		return hand_suit;
	}

	public void setHand_suit(int[] hand_suit) {
		this.hand_suit = hand_suit;
	}

	public void setCard_hand(String[] card_hand) {
		this.card_hand = card_hand;
	}
	
	public void change_card() {
		for( int i = 0; i < this.card_hand.length; i++ ) {
			int num = Arrays.asList(this.POKER_NUM).indexOf(String.valueOf(card_hand[i].charAt(1)));
			this.card_hand[i] = this.card_hand[i].charAt(0) + "" + (num+1);
		}
	}
	
	public void order_card() {
		for( int i = 0; i < this.card_hand.length - 1; i++ ) {
			for( int j = 0; j < this.card_hand.length - 1 - i; j++ ) {
				if( Integer.parseInt((this.card_hand[j].replaceAll("[^0-9]", ""))) > Integer.parseInt((this.card_hand[j+1].replaceAll("[^0-9]", ""))) ) {
					String tmp = this.card_hand[j];
					this.card_hand[j] = this.card_hand[j+1];
					this.card_hand[j+1] = tmp;
				}
			}
		}
	}
	
	public void hand_count() {
		for( int i = 0; i < this.card_hand.length; i++ ) {
			int num = Integer.parseInt(this.card_hand[i].replaceAll("[^0-9]", "")) - 1;
			this.hand_num[num]++;
		}
		
		for( int j = 0; j < this.card_hand.length; j++ ) {
			String shape = this.card_hand[j].replaceAll("[0-9]", "");
			
			if( shape.equals(this.POKER_SUIT[0])) {
				this.hand_suit[0]++;
			} else if( shape.equals(this.POKER_SUIT[1])) {
				this.hand_suit[1]++;
			} else if( shape.equals(this.POKER_SUIT[2])) {
				this.hand_suit[2]++;
			} else if( shape.equals(this.POKER_SUIT[3])) {
				this.hand_suit[3]++;
			}
		}
		
		this.setHand_num(hand_num);
		this.setHand_suit(hand_suit);
	}
	
	public void jokbo_case() {
		
		// ----- 스티플(로티플) 시작 -----
		for( int i = 0; i < this.hand_suit.length; i++ ) {
			if( this.hand_suit[i] == 5 ) {
				if( Integer.parseInt(this.card_hand[4].replaceAll("[^0-9]", "")) - Integer.parseInt(this.card_hand[0].replaceAll("[^0-9]", "")) == 4 ) {
					this.setResult(this.POKER_NUM[Integer.parseInt(this.card_hand[4].replaceAll("[^0-9]", "")) - 1] + "스티플");
//					System.out.println("스티플");
					return;
				} else if( Integer.parseInt(this.card_hand[0].replaceAll("[^0-9]", "")) == 1 && Integer.parseInt(this.card_hand[1].replaceAll("[^0-9]", "")) == 10) {
					this.setResult("로티플");
//					System.out.println("로티플");
					return;
				}
			}
		}
		// ----- 스티플(로티플) 끝 -----
		
		// ----- 포카드 시작 -----
		for( int i = 0; i < this.hand_num.length; i++ ) {
			if( this.hand_num[i] == 4 ) {
				this.setResult(this.POKER_NUM[i] + "포카드"); 
				
				return;
			}
		}
		// ----- 포카드 끝 -----
		
		// ----- 풀하우스 시작 -----
		for( int i = this.hand_num.length - 1; i >= 0; i-- ) {
			for( int j = 0; j < this.hand_num.length; j++ ) {
				if( this.hand_num[i] == 3 && i != j && this.hand_num[j] >= 2 ) {
					this.setResult(this.POKER_NUM[i] + "풀하우스");
					
					return;
				}
			}
		}
		// ----- 풀하우스 끝 -----
			
		// ----- 플러쉬 시작 -----
		for( int i = 0; i < this.hand_suit.length; i++ ) {
			if( this.hand_suit[i] == 5 ) {
				int fnum = Integer.parseInt(this.card_hand[4].replaceAll("[^0-9]", ""));
				this.setResult(this.POKER_NUM[fnum-1] + "플러쉬");
//				System.out.println("플러쉬");
				
				return;
			}
		}
		// ----- 플러쉬 끝 -----
		
		// ----- 스트레이트 시작 -----
		int[] card_num = new int[this.card_hand.length];
		
		for( int i = 0; i < card_num.length; i++ ) {
			card_num[i] = Integer.parseInt(this.card_hand[i].replaceAll("[^0-9]", ""));
		}
		
		if( card_num[0] + 1 == card_num[1] && card_num[1] + 1 == card_num[2] && 
			card_num[2] + 1 == card_num[3] && card_num[3] + 1 == card_num[4] ) {
			
			this.setResult(this.POKER_NUM[card_num[4] - 1] + "스트레이트");
			
			return;
		} else if(card_num[0] == 1 && card_num[1] == 10 && card_num[2] == 11
								   && card_num[3] == 12 && card_num[4] == 13) {
			
			this.setResult("마운틴");

			return;
		}
			
			
		// ----- 스트레이트 끝 -----
	
		// ----- 트리플 시작 -----
		for( int i = this.hand_num.length - 1; i >= 0; i-- ) {
			if( this.hand_num[i] >= 3 ) {
				this.setResult(this.POKER_NUM[i] + "트리플");
				
				return;
			}
		}
		// ----- 트리플 끝 -----
		
		// ----- 투페어 시작 -----
		for( int i = this.hand_num.length - 1; i >= 0; i-- ) {
			for( int j = 0; j < this.hand_num.length; j++ ) {
				if( this.hand_num[i] >= 2 && i != j && this.hand_num[j] >= 2) {
					this.setResult(this.POKER_NUM[i] + "투페어");
					
					return;
				}
			}
		}	
		// ----- 투페어 끝 -----
		
		// ----- 원페어 시작 -----
		for( int i = 0; i < this.hand_num.length; i++ ) {
			if( this.hand_num[i] >= 2 ) {
				this.setResult(this.POKER_NUM[i] + "페어");
				
				return;
			}
		}		
		// ----- 원페어 끝 -----
		
		// ----- 나머지(탑) 시작 -----
		for( int i = this.hand_num.length - 1; i >= 0; i-- ) {
			if( this.hand_num[i] != 0 ) {
				this.setResult(this.POKER_NUM[i] + "탑");
				
				return;
			}
		}
		
		// ----- 나머지(탑) 끝 -----
	}
	
}





































