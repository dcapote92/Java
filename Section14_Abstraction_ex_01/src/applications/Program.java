package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Person;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int times = sc.nextInt();
		for (int i = 0; i < times; i++) {
			sc.nextLine();
			System.out.printf("Tax payer #%d data:%n", i + 1);
			System.out.print("Individual or Company (i/c)? ");
			char tag = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if (tag == 'i') {
				System.out.print("Healt expenditures: ");
				Double healthCare = sc.nextDouble();
				Person person = new Person(name, income, healthCare);
				list.add(person);
			} else {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				Company company = new Company(name, income, employees);
				list.add(company);
			}
		}
		sc.close();
		System.out.println("\nTAXES PAID:");
		Double totalTaxes = 0.0;
		for (TaxPayer payer : list) {
			System.out.println(payer);
			totalTaxes += payer.tax();
		}
		System.out.printf("%nTOTAL TAXES: $%.2f", totalTaxes);
	}
}
