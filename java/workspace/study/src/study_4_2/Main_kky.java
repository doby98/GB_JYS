package study_4_2;

public class Main_kky {

	public static void main(String[] args) {
		game_kky dun = new game_kky();
		int[][] dungeon = { {50, 10}, {30, 20}, {60, 20}, {30, 30}, {40, 20}, {45, 15}, {20, 10}, {30, 20} };
		System.out.println(dun.solution(100, dungeon));
	}
}
