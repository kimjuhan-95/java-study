package exercise04.ex03;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	@Override
	public double area() {
		return width * height;
		
	}

	

}
