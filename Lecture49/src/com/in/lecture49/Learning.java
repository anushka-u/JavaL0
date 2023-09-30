package com.in.lecture49;
class Parent
{
	void m1()
	{
		System.out.println("Parent class method");	}
}
public class Learning extends Parent {

	void m1()
	{
		super.m1();
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learning l = new Learning();
		l.m1();

	}

}
