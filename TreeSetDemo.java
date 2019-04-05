package com.reg.collections;

import java.util.TreeSet;

public class TreeSetDemo {
	TreeSet<String> Ts = new TreeSet<String>();

	public void addTreeSet() {

		Ts.add("shakthi");
		Ts.add("arul");
		Ts.add("karthik");
		Ts.add("koralla");

		for (String obj : Ts)
			System.out.println(obj);
	}

	public void removeTreeSet() {
		System.out.println("\n");

		Ts.remove(3);
		for (String s : Ts)
			System.out.println(s);
	}

	TreeSet<Integer> Tsint = new TreeSet<Integer>();

	public void addTreeSetInt() {
		System.out.println("\n");

		Tsint.add(1);
		Tsint.add(2);
		Tsint.add(3);
		Tsint.add(4);

		for (int Tsint : Tsint)
			System.out.println(Tsint);
	}

	public void removeTreeSetInt() {
		System.out.println("\n");

		Tsint.remove(3);
		for (int i : Tsint)
			System.out.println(i);
	}


}
