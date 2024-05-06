package entities;

public class Rectangle {

	public double width, height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * width + 2 * height;
	}

	public double diagonal() {
		// Acha-se com Pitágoras
		double diag = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(diag);
	}

}
