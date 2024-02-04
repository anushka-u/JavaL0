package com.in.incrementdecrement;

import java.util.Scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int c = a++ + b;
		System.out.println("Value of c is " + c);
		
		c = ++a + b;
		System.out.println("value of a And b is "+ a + " " + b);
		System.out.println("Upon post incrementing a, value of c is "+ c);
		
		c = a-- + b;
		System.out.println("value of a And b is "+ a + " " + b);
		System.out.println("Upon post decrementing a, value of c is "+ c);
		
		c = --a + b;
		System.out.println("value of a And b is "+ a + " " + b);
		System.out.println("Upon pre decrementing a, value of c is "+ c);

	}

}
