package applications;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.printf("Total area: %.2f",totalArea(myShapes) );
	}
	
	//Wildcards doesn't accept subtypes or subclasses directly
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		for( Shape shape: list) {
			sum += shape.area();
		}
		return sum;
	}

}
