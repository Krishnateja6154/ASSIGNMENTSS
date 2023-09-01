package com.assignment.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Teja",1,"Tadipatri"),
				new Employee("Bharath",2,"Nellore"),
				new Employee("Sai",3,"Proddatur"),
				new Employee("Krishna",4,"Tadipatri")
		);
		
//		Iterator iterator =list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println();
		for(Employee emp:list) {
			System.out.println(emp);
		}
		System.out.println();
		List<String> sameCity=new ArrayList<>();
		for(Employee emp:list) {
			if(emp.getCity().equals("Tadipatri")) {
				sameCity.add(emp.getName());
			}
		}
		for(String name:sameCity) {
			System.out.println(name);
		}
		
	}

}
