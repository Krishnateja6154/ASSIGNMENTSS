package com.training.quest4;

import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		Supplier<String> supplier=()->{
			String name="Krishnateja";
			String upperName=name.toUpperCase();
			return upperName;
		};
		System.out.println(supplier.get());
	}

}
