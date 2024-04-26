package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int times = sc.nextInt();
		for (int i = 0; i < times; i++) {
			sc.nextLine();
			System.out.printf("Product #%d data:%n", i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char tag = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (tag == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				ImportedProduct imported = new ImportedProduct(name, price, customFee);
				list.add(imported);
			}else if( tag == 'u') {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.nextLine());
				UsedProduct used = new UsedProduct(name, price, date);
				list.add(used);
			}else {
				Product common = new Product(name, price);
				list.add(common);
			}
		}
		sc.close();
		
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
	}

}
