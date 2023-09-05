package com.training.quest2;

public class ScitenficCal extends BasicCal implements Sctientific {
	@Override
	public void square(int x) {
		System.out.println("Square root " + Math.pow(x, 2));
	}

	@Override
	public void cube(int x) {
		System.out.println("Square root " + Math.pow(x, 3));
	}
}
