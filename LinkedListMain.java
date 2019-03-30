package com.reg.java;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(55);
		l.add(25);
		l.add(29);
		l.add(66);
		l.add(89);
		l.add(20);
		l.delete(89);
		l.delete(29);
		l.delete(20);
	    l.add(20);
	  
		l.size();
		l.max();
		l.min();
		l.display();
		
		
	}

}
