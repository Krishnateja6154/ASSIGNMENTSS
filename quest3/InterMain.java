package com.training.quest3;

import java.util.function.Consumer;

public class InterMain {

	public static void main(String[] args) {
		Consumer<Integer> consumer = a -> {
			int b = 10;
			System.out.println(a + b);
		};
		consumer.accept(20);
	}

}
