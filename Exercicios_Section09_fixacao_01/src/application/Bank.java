package application;

import java.util.Locale;
import java.util.Scanner;

import signup.Account;

public class Bank {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		if (option == 'Y' || option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			account = new Account(number, name, deposit);
		} else {
			account = new Account(number, name);
		}

		System.out.printf("%nAccount data:%nAccount %d, Holder: %s, Balance: $ %.2f%n", account.getNumber(),
				account.getOwnerName(), account.getAmount());
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.printf("%nUpdated Account data:%nAccount %d, Holder: %s, Balance: $ %.2f%n", account.getNumber(),
				account.getOwnerName(), account.getAmount());
		System.out.print("Enter a withdraw value: ");
		account.extract(sc.nextDouble());
		System.out.printf("%nUpdated Account data:%nAccount %d, Holder: %s, Balance: $ %.2f%n", account.getNumber(),
				account.getOwnerName(), account.getAmount());
		sc.close();
	}
}
