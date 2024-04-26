package applications;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<String> list2 = Arrays.asList("Daniel");
		List<Double> list3 = Arrays.asList(0.1, 0.2);
		printList(list1);
		printList(list2);
		printList(list3);
		
	}
	
	// List<?> accept any tipe of data, but it doesn't accept to add elements( It's just to process list, not alter it)
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
