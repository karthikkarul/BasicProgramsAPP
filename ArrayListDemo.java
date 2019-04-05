package com.reg.collections;
import java.util.ArrayList;

public class ArrayListDemo {
	ArrayList<String> al = new ArrayList<String>();
	
	public void addArray(){
		
		
		al.add("shakthi");
		al.add("arul");
		al.add("karthik");
		al.add("koralla");
		
		for(String obj : al)
			System.out.println(obj);
	}
	public void remArray() {
		
		al.remove(3);
		for (String s:al)
			System.out.println("\n"+s);
	}

	
ArrayList<Integer> alint = new ArrayList<Integer>();
	
	public void addArrayInt(){
		
		
		
		alint.add(1);
		alint.add(2);
		alint.add(3);
		alint.add(4);
		
		for(int ali : alint)
			System.out.println(ali);
	}
	public void remArrayInt() {
		
		alint.remove(3);
		for (int i:alint)
			System.out.println("\n"+i);
	}
	
	
}
