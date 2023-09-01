package com.shristi.overloading;

public class Employee {
	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	double calcBonus(double basicAllowance) {
		return 255.876;
	}

	double calcBonus(double basicAllowance, double carAllowance) {
		return 476.965;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return 7554.865;
	}
}
