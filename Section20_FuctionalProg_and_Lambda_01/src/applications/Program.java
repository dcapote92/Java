package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "/home/cpd/Documentos/GitHub/Java/Section20_FuctionalProg_and_Lambda_01/src/products.csv";
		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(",");
				list.add(new Product(field[0], Double.parseDouble(field[1])));
				line = br.readLine();
			}

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			double average = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();
			List<String> productNames = list.stream().filter(p -> p.getPrice() < average).map(p -> p.getName())
					.sorted(comp.reversed()).collect(Collectors.toList());

			System.out.println("Full file path: " + path);
			System.out.printf("Average price: %.2f%n", average);
			productNames.forEach(System.out::println);
			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
