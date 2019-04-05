package com.reg.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	Map<Integer, String> mp = new HashMap<>();
	
	void mapDemo() {
		
	mp.put(1, "arul");
	mp.put(2, "shakthi");
	mp.put(3, "karthik");
	mp.put(4, "mani");
	mp.put(5, "vijay");
	}
	
	void mapEntry() {
		System.out.println("---printing data using entryset method");
		for(Map.Entry entry : mp.entrySet()) {
			Integer i = (Integer)entry.getKey();
			String s = (String) entry.getValue();
			System.out.println(i+" "+s);
		}
	}
	
	
Set<Integer> keySet = mp.keySet();

void mapIterator() {
	
	System.out.println("---using iterator---");
	
	Iterator it = keySet.iterator();
	while (it.hasNext()) {
		
		Integer i = (Integer) it.next();
		String s = (String) mp.get(i);
		System.out.println(i+ " "+ s);
	}
}

void enhancedLoop() {
	
	System.out.println("----using enhanced loop----");
	
	for(Integer i : keySet) {
		String s = mp.get(i);
		System.out.println(i+" "+s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


}
