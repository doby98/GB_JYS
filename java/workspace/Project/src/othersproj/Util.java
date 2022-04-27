package othersproj;

public class Util {
	// 싱글톤으로 random(min, max) 메서드를 추가
	// ----------- 싱글톤 객체 생성을 위한 준비 시작 -------------
		private static Util current;	// 내 자신에 대한 객체 선언
		
		public static Util getInstance() {
			if(current == null) {
				current = new Util();
			}
			return current;
		}
		
		public static void freeInstance() {
			current = null;	// 메모리 지우기
		}
		
		private Util() {
			super();	// 생략 가능
		}
		// ----------- 싱글톤 객체 생성을 위한 준비 끝 -------------
		
		// 이 클래스가 구현해야 하는 기능
		/*
		 * 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
		 * @param min - 범위 안에서의 최소값
		 * @param max - 범위 안에서의 최대값
		 * @return min~max 안에서의 랜덤값
		 */
		public int random(int min, int max) {
			int num = (int)((Math.random() * (max - min + 1)) + min);
			return num;
		}
}
