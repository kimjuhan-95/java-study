package exercise04.ex08;

public class Rectangle extends Shape implements Resizable {
	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return width * height;
		
	}
	
	@Override
    public double getPerimeter() {
        return 2 * (width + height);
	}
	

	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
		

	}

}
