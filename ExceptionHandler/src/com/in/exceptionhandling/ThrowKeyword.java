package com.in.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a = 12;
		int b=0;
		int c =0;
		
		try {
			if(b==0)
			{
				ArithmeticException arithmeticException  = new ArithmeticException("Division by 0 isn't possible");
				throw(arithmeticException);
			}
			c=a/b;
			System.out.println("Division = " + c);
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
