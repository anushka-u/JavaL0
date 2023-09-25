package com.in.accessspecifier;

//Class cannot be private only public, abstract and final is allowed
public class privateEmployee {

	//If we have our constructor as private we will not be able to create object of class
	public privateEmployee()
	{
		System.out.println("Private Employee :: Constructor");
	}
	//It's a private method cannot be called outside of this class.
	private void method()
	{
		System.out.println("A Private method from private class");
	}
	
	public void method2()
	{
		method();
	}
	
}
