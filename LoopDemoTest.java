package com.reg.java;

class LoopDemo {
	public static void print1to10(int n) {
		int i = 0;
		System.out.println("1 to 20 numbers are");
		for (i = 1; i <= n; i++)

			System.out.print(" " + i + " ");
	}

	public static void print10to1(int n) {
		System.out.println("\n" + "\n" + "20 to 1 numbers are");
		int i = 20;

		do {
			System.out.print(" " + i);
			i--;
		} while (i >= 0);
	}

	public static void printeven(int n) {
		System.out.println("\n" + "\n" + "even numbers are");
		int i = 0;
		for (i = 0; i <= n; i++)
			if (i % 2 == 0)
				System.out.print(" " + i);
	}

	public static void printOdd(int n) {
		System.out.println("\n" + "\n" + "odd numbers are");
		int i = 0;
		for (i = 0; i <= n; i++)
			if (i % 2 != 0)
				System.out.print(" " + i);
	}

	public static void printPrime(int n) {
		System.out.println("\n" + "\n" + "prime no's are");

		for (int i = 3; i <= 50; i++) {
			int flag = 0;

			for (int k = 2; k <= i / 2; k++) {
				if (i % k == 0) {
					flag = 1;
				}
			}
			if (flag == 0)
				System.out.print(" " + i + " ");

		}
	}

	public static void printAltNum(int n) {
		System.out.println("\n" + "\n" + "alt numbers are");
		int i = 1;
		for (i = 1; i <= n;) {
			System.out.print(" " + i);
			i += 2;
		}

	}

	public static void PrintDiv7(int n) {
		System.out.println("\n" + "\n" + "no divisible by 7 are");
		int i = 0;
		for (i = 0; i <= n; i++) {
			if (i % 7 == 0)
				System.out.print("  " + i);

		}
	}
}

public class LoopDemoTest {
	public static void main(String args[]) {
		int n = 20;

		LoopDemo.print1to10(n);
		LoopDemo.print10to1(n);
		LoopDemo.printeven(n);
		LoopDemo.printOdd(n);
		LoopDemo.printPrime(n);
		LoopDemo.printAltNum(n);
		LoopDemo.PrintDiv7(n);
	}

}
