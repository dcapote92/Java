package applications;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_CovarianceAndContravariance {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		printList(myObjs);
		System.out.println();
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	/*
	 * List<? extends Number> source --> COVARIANCE, Extended class or type and its
	 * subtypes or subclasses can be accessed, but not modified.
	 * 
	 *  List<? super Number> destiny --> CONTRAVARIANCE, works with supertypes of the informed class,
	 * elements can be added to the list, but can't be listed.
	 */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}
}
