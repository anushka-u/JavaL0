package com.in.inheritance;

class Parent {
	void m1()
	{
		System.out.println("Parent Class method m1");
	}
}
class Child extends Parent{
	void m1()
	{
		System.out.println("I am method of parent class, But overrided in Child class");
	}
	
	void m2()
	{
		System.out.println("I am Child class method m2");
	}
	
}
public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Child c = new Child();
			c.m1(); //method of child will be called because it's overridden in Child class
			c.m2(); // Mehod of child class will be called
			String output = c.toString(); //It will check in child first then parent then in Object class and it's a method of default object class so it will call this method of object class.
			System.out.println(output);
		}
		

	}

}
