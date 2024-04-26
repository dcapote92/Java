package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "/home/cpd/Documentos/GitHub/Java/Section20_FunctionalProg_and_Lambda_02/src/employee.csv";
		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(",");
				Employee emp = new Employee(field[0], field[1], Double.parseDouble(field[2]));
				list.add(emp);
				line = br.readLine();
			}
			System.out.println("Full file path: " + path);
			System.out.print("Enter the comparative salary value: ");
			double value = sc.nextDouble();
			sc.close();

			System.out.printf("Email of those whose salary is higher than %.2f:%n", value);
			
			list.stream().filter(e -> e.getSalary() > value).map(e -> e.getEmail())
					.sorted((email1, email2) -> email1.toUpperCase().compareTo(email2.toUpperCase()))
					.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.printf("Sum of salary of those whose name starts with 'M': %.2f", list.stream()
					.filter(e -> e.getName().startsWith("M")).map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
