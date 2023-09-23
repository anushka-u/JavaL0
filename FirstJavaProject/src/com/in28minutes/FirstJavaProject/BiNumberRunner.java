package com.in28minutes.FirstJavaProject;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber Number = new BiNumber(2, 3);
		System.out.println(Number.add());
		System.out.println(Number.multiply());
		Number.doubleTheNumber();
		System.out.println(Number.getnumber1());
		System.out.println(Number.getnumber2());

	}

}
