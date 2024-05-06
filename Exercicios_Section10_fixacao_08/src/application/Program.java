package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How much numbers on the vector? ");
		int[] numbers = new int[sc.nextInt()];
		int evenNumber = 0;
		float sum = 0f;
		for(int i = 0;i<numbers.length;i++) {
			System.out.printf("Insert %d° number: ", i+1);
			numbers[i] = sc.nextInt();
			if(numbers[i] % 2 == 0) {
				evenNumber++;
				sum += numbers[i];
			}
		}
		sc.close();
		if(evenNumber == 0) {
			System.out.println("There aren't even numbers");
		}else {
			System.out.printf("Average of even numbers: %.1f %n", sum/evenNumber);
		}
		
		
	}

}
