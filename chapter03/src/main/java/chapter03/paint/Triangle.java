package chapter03.paint;

public class Triangle extends Shape {
	private Point[] point;
	private String lineColor;
	private String fillColor;
	@Override
	
	public  void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}

}
