package com.shristi.overloading;

public class OverloadingMain {

	public static void main(String[] args) {
		Employee employee=new Employee("Teja", "Manager");
		double ans=employee.calcBonus(10.76, 12.9);
		System.out.println(ans);
		Employee employee1=new Employee("Krishna","Programmer");
		double result=employee1.calcBonus(10.76);
		System.out.println(result);
		Employee employee2=new Employee("Kallamadi","Director");
		double output=employee2.calcBonus(10.76, 12.9, 11.8);
		System.out.println(output);
	}

}
