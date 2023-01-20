package Day2;

public class Rectangle extends Shape{
	private double l;
	private double b;
	public Rectangle(String shapeName, double l, double b) {
		super(shapeName);
		this.l = l;
		this.b = b;
	}
	public double calculateArea() {
		return l*b;
	}
}
