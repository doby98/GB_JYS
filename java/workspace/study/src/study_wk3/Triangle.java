package study_wk3;

/*
 * 삼각형의 넓이 구하기
 * 
 * 삼각형의 넓이 = (밑변 * 높이) / 2
 * 
 * 문제 : Triangle 클래스를 만들어 삼각형의 넓이를 구한다
 * 
 * 조건.  	
 * 1. 삼각형의 높이와 밑변의 길이를 멤버변수로 가져야하며
 * 2. 삼각형의 넓이를 구하는 메서드, 삼각형의 높이를 입력받는 메서드,
 *    삼각형의 밑변의 길이를 입력받는 메서드가 포함되어야 한다.
 *    
 * 3. 클래스와 클래스의 메서드를 이용하여 삼각형의 넓이를 구하여라
 * 
 */

public class Triangle {

	public static void main(String[] args) {
		Triangle_size ts = new Triangle_size();
		
		ts.getHeight(5.5F);
		ts.getWidth(7F);
		float area = ts.triangle_area();
		System.out.println("삼각형 넓이 : " + area);
	}

}

class Triangle_size {
	float height;
	float width;
	
	public void getHeight( float height ) {
		this.height = height;
	}
	
	public void getWidth( float width ) {
		this.width = width;
	}
	
	public float triangle_area() {
		return (this.height * this.width) / 2.0F;
	}
	
}
