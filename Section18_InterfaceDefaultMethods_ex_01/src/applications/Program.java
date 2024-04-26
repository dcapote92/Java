package applications;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInteresService;
import services.USAInterestService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		sc.close();
		BrazilInteresService bis = new BrazilInteresService(2.0);
		USAInterestService uis = new USAInterestService(1.0);
		System.out.printf("Payment after %d months with USA interest rate: %.2f%n",months, uis.payment(amount, months) );
		System.out.printf("Payment after %d months with Brazil interest rate: %.2f",months, bis.payment(amount, months) );
	}
}
