package study_4_2;

import java.util.Arrays;

public class Main_ksw {

	public static void main(String[] args) {
		Problem_ksw jokbo = new Problem_ksw();
		
		System.out.println(Arrays.toString(jokbo.getCard_hand()));
		jokbo.change_card();
		System.out.println(Arrays.toString(jokbo.getCard_hand()));
		jokbo.order_card();
		System.out.println(Arrays.toString(jokbo.getCard_hand()));
		jokbo.hand_count();
		System.out.println(Arrays.toString(jokbo.getHand_num()));
		System.out.println(Arrays.toString(jokbo.getHand_suit()));
		
		jokbo.jokbo_case();
		System.out.println(jokbo.getResult());
	}

}
