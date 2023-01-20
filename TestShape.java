package Day2;
import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		double result =TestShape.Area();
		System.out.println(result);

	}
	public static double Area() {
		System.out.println("Area for which shape do you wanna calculate: ");
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		switch(num) {
		case 1:
			System.out.println("Enter the side of the square: ");
			Square square = new Square("square", x.nextDouble());
			double resultSquare = square.calculateArea();
			return resultSquare;
			
		case 2:
			System.out.println("Enter length and breadth of the rectangle: ");
			Rectangle rectangle = new Rectangle("rectangle", x.nextDouble(), x.nextDouble());
			double resultRectangle = rectangle.calculateArea();
			return resultRectangle;
			
		case 3:
			System.out.println("Enter the radius of the circle: ");
			Circle circle = new Circle("Circle", x.nextDouble());
			double resultCircle = circle.calculateArea();
			return resultCircle;
		}
		return num;
	}

}
