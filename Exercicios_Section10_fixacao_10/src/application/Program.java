package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How much students will be inserted? ");
		String[] names = new String[sc.nextInt()];
		float[] firstSemester = new float[names.length], secondSemester = new float[names.length];
		for (int i = 0; i < names.length; i++) {
			sc.nextLine();
			System.out.printf("Insert %d° student data:%n", i + 1);
			System.out.print("Name: ");
			names[i] = sc.nextLine();
			System.out.print("1rst Semester grades: ");
			firstSemester[i] = sc.nextFloat();
			System.out.print("2nd Semester grades: ");
			secondSemester[i] = sc.nextFloat();
		}
		sc.close();
		System.out.println("\nAproved students:");
		for (int i = 0; i < names.length; i++) {
			if((firstSemester[i]+secondSemester[i])/2 >= 6f) {
				System.out.println(names[i]);
			}
		}

	}

}
