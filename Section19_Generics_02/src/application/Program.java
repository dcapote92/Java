package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		String path = "/home/cpd/Documentos/GitHub/Java/Exercicio_Section19_Generics_02/src/produtos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] field = line.split(",");
				list.add(new Product(field[0], Double.parseDouble(field[1])));
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
