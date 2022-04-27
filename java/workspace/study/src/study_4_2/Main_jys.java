package study_4_2;

import java.util.Arrays;

public class Main_jys {

	public static void main(String[] args) {
		Price_jys win = new Price_jys();
		
		win.setArr();
		win.setRank();
		
		System.out.println(Arrays.toString(win.reward()));
	}

}
