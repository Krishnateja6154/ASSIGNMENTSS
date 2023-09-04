package com.training.quest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		List<String> list1=new ArrayList();
		list1.add("Tadipatri");
		list1.add("Anantapur");
		List<String> list2=new ArrayList();
		list2.add("banglore");
		list2.add("Udipi");
		List<String> list3=new ArrayList();
		list3.add("Chennai");
		list3.add("Vellore");
		
	Map<String,List<String>> map=new HashMap<>();
	map.put("AndhraPradesh", list1);
	map.put("Karnataka", list2);
	map.put("Tamilnadu", list3);
	for(Object o:map.entrySet()) {
		System.out.println(o);
	}
	
	}
}
