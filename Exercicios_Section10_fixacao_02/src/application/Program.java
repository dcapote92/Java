package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		float[] numbers = new float[sc.nextInt()];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextFloat();
		}
		sc.close();
		float soma = 0f;
		System.out.printf("%nVALORES = ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%.1f ",numbers[i]);
			soma += numbers[i];
		}
		System.out.printf("%nSOMA = %.2f", soma);
		System.out.printf("%nMEDIA = %.2f", soma/numbers.length);
		
	}

}
