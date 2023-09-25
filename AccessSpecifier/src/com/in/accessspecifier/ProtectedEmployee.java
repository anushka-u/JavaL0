package com.in.accessspecifier;

public class ProtectedEmployee {

	protected int age;
	protected int id;
	protected String name;
	protected ProtectedEmployee()
	{
		System.out.println("Protected :: Constructor");
	}
	protected void method()
	{
		System.out.println("Protected method of Protected Class");
	}
	
}
