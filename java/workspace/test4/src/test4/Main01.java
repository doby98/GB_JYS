package test4;

// 7. main 메서드를 포함하는 클래를 생성
public class Main01 {

	public static void main(String[] args) {
		// 8. Student 클래스 객체 생성
		Student std = new Student("유섭", 12, 35, 88, 92, 98);
		
		// 9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출
		System.out.println("총점 : " + std.total());
		System.out.println("평균 : " + std.average());
		
		// 10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출
		std.tostring();
	}

}
