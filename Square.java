package Day2;

public class Square extends Shape {

	private double n;

	public Square(String square, double n) {
		super(square);
		this.n = n;
	}
	public double calculateArea() {
		return n*n;
	}
}
