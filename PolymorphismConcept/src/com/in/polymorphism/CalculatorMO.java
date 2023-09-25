package com.in.polymorphism;


public class CalculatorMO {
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorMO cl = new CalculatorMO();
		int ans = cl.add(3, 4);
		System.out.println(ans);
		
		int result = cl.add(3, 4,5);
		System.out.println(result);

	}

}
