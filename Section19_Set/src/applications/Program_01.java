package applications;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program_01 {
	public static void main(String[] args) {
		
		//Set doesn't accept duplicated elements, have no positions.
		
		// The fastest, it's like a bag, have no order inside, don't respect introduction order.
		Set<String> set = new HashSet<>();
		
		//The slowest, ordered by Comparator ( elements are automatically ordered)
		Set<String> treeset = new TreeSet<String>();
		
		//Mid velocity, elements keep the order they are inserted.
		Set<String> linkedhashset = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		treeset.add("TV");
		treeset.add("Notebook");
		treeset.add("Tablet");
		
		linkedhashset.add("TV");
		linkedhashset.add("Notebook");
		linkedhashset.add("Tablet");
		
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();
		for (String p : treeset) {
			System.out.println(p);
		}
		System.out.println();
		for (String p : linkedhashset) {
			System.out.println(p);
		}
	}
}
