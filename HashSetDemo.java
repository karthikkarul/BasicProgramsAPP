package com.reg.collections;

import java.util.HashSet;

public class HashSetDemo {
	HashSet<String> hs = new HashSet<String>();

	public void addHashSet() {

		hs.add("shakthi");
		hs.add("arul");
		hs.add("karthik");
		hs.add("koralla");

		for (String obj : hs)
			System.out.println(obj);
	}

	public void removeHashSet() {
		System.out.println("\n");

		hs.remove(3);
		for (String s : hs)
			System.out.println(s);
	}

	HashSet<Integer> hsint = new HashSet<Integer>();

	public void addHashSetInt() {
		System.out.println("\n");

		hsint.add(1);
		hsint.add(2);
		hsint.add(3);
		hsint.add(4);

		for (int hsint : hsint)
			System.out.println(hsint);
	}

	public void removeHashSetInt() {
		System.out.println("\n");

		hsint.remove(3);
		for (int i : hsint)
			System.out.println(i);
	}

}
