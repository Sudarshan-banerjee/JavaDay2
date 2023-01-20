package Day2;

public class Circle extends Shape{
	private double r;
	public Circle(String shapeName, double r) {
		super(shapeName);
		this.r = r;
	}
	public double calculateArea() {
		return 3.14*r*r;
	}
}
