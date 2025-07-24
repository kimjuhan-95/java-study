package exercise04.ex08;

public class RectTriangle extends Shape {
	public RectTriangle(double width, double height) {
        super(width, height);
	}
	

	@Override
	public double getArea() {
		return 0.5 * width * height;
			
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width * width + height * height);
	}

}
