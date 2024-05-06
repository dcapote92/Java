package model.entities;

import model.exception.DepositException;

public class Account {
	int number;
	String holder;
	double balance, withdrawLimit;

	public Account(int number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws DepositException {
		validateWithdraw(amount);
		this.balance -= amount;
	}
	
	private void validateWithdraw( double amount) throws DepositException {
		if ( amount > getWithdrawLimit()) {
			throw new DepositException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new DepositException("Withdraw error: Not enough balance");
		}
	}
}
