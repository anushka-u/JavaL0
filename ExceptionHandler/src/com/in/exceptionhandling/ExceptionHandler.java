package com.in.exceptionhandling;

public class ExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b=0;
		 
		try {
			int c = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("Above code cause aruthmetic exception");
		}
		
		System.out.println("After hyandling exception");
	}

}
