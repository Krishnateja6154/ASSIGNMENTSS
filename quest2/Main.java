package com.training.quest2;

public class Main {

	public static void main(String[] args) {
		ICalculator cal = new BasicCal();
		cal.add(2, 3);
		cal.difference(50, 25);
		cal.product(2, 3);
		cal.divide(20, 10);
		System.out.println();
		
		Sctientific sci = new ScitenficCal();
		sci.add(10,20);
		sci.difference(50, 30);
		sci.product(5, 4);
		sci.divide(80, 4);
		sci.square(3);
		sci.cube(2);
	}

}
