package study_4_2;

import java.util.Arrays;

public class Main_pjh {

	public static void main(String[] args) {
		Thanos_Jack thanos = new Thanos_Jack();
		int[] thanos_list = {2, 3, 4, 5, 7, 8, 9};
		
		thanos.setThanos_list( thanos_list );
		thanos.finger_snap();
		System.out.println(Arrays.toString(thanos.getThanos_list()));
		System.out.println(Arrays.toString(thanos.delete_arr));
	}

}
