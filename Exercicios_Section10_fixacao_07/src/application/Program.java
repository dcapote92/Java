package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How much numbers on the vector? ");
		float[] numbers = new float[sc.nextInt()];
		float sum = 0f;
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Insert %d° number: ", i+1);
			numbers[i] = sc.nextFloat();
			sum += numbers[i];
		}
		sc.close();
		float average = sum/numbers.length;
		System.out.printf("Vector average: %.3f %n", average);
		System.out.println("Elements under vector average:");
		for (int i = 0; i < numbers.length; i++) {
			if( numbers[i] < average) {
				System.out.printf("%.1f%n",numbers[i]);
			}
		}
	}
}
