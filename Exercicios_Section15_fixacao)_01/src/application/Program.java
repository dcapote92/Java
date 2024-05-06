package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DepositException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.print("\nEnter amount for withdraw: ");
		double amount = sc.nextDouble();
		sc.close();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f", acc.getBalance());
		} catch (DepositException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
