package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How much numbers will be inserted? ");
		float[] numbers = new float[sc.nextInt()];
		float max = 0f;
		int pos = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Insert %d° decimal number: ", i + 1);
			numbers[i] = sc.nextFloat();
			if (numbers[i] > max) {
				max = numbers[i];
				pos = i;
			}
		}
		sc.close();
		System.out.printf("%nMax value: %.1f %nMax value position: %d", max, pos);
	}

}
