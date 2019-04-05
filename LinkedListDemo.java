package com.reg.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	LinkedList<String> ll = new LinkedList<String>();

	public void addLinked() {

		ll.add("shakthi");
		ll.add("arul");
		ll.add("karthik");
		ll.add("koralla");

		for (String obj : ll)
			System.out.println(obj);
	}

	public void remLinked() {
		System.out.println("\n");

		ll.remove(3);
		for (String s : ll)
			System.out.println(s);
	}

	LinkedList<Integer> llint = new LinkedList<Integer>();

	public void addLinkedInt() {
		System.out.println("\n");

		llint.add(1);
		llint.add(2);
		llint.add(3);
		llint.add(4);

		for (int lli : llint)
			System.out.println(lli);
	}

	public void remLinkedInt() {
		System.out.println("\n");

		llint.remove(3);
		for (int i : llint)
			System.out.println( i);
	}

}
