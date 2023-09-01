package com.shristi.inheritdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	void withdraw(double amount) {
		System.out.println(10000);
	}

	@Override
	void deposit(double amount) {
		System.out.println(23000);
	}
}
