package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("How many employees will be added? ");
		int quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.printf("%d° employee data:%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Wage: ");
			float wage = sc.nextFloat();
			Employee employee = new Employee(id, name, wage);
			list.add(employee);
		}

		System.out.print("\nEnter the employee id that will have wage increase: ");
		int idToIncrease = sc.nextInt();
		System.out.print("Enter the perecentage: ");
		float percent = sc.nextFloat();
		sc.close();
		for (Employee e : list) {
			if (e.getId() == idToIncrease) {
				e.increaseWage(percent);
			}
		}
		System.out.println("\nList of employees:");
		for (Employee e : list) {
			System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getWage());
		}

	}

}
