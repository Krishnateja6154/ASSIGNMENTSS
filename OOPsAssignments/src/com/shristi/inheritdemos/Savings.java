package com.shristi.inheritdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println(2000);
	}

	@Override
	void deposit(double amount) {
		System.out.println(3000);
	}
	

}
