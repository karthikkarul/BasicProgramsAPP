package com.reg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	List<String> itd = new ArrayList<String>();
	
	void iteratorDemo() {
		itd.add("arul");
		itd.add("karthik");
		itd.add("satish");
		itd.add("rohit");
	}
	
	void iterator() {
		
		Iterator<String> it = itd.iterator();
		System.out.println("-----printed using iterator-----");
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}
	
	
	void enhancedLoop() {
		System.out.println("\n\n-------using enhanced loop-------");
		for(String s: itd) {
		System.out.println(s);
	}
	}
}
