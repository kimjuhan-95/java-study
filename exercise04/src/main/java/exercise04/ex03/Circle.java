package exercise04.ex03;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	@Override
	public double area() {
		return 3.14 * radius * radius;
	}

}
