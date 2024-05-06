package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What´s the dollar price? ");
		float price = sc.nextFloat();
		System.out.print("How many dollar will be bought? ");
		float quantity = sc.nextFloat();
		sc.close();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(price, quantity));
	}

}
