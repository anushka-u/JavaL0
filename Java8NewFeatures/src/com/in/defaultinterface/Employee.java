package com.in.defaultinterface;

public class Employee implements Test {

	@Override
	public void Sum(int x, int y) {
		int sum = x+y;
		System.out.println("Sum is : "+ sum);
		
	}

}
