package com.in.abstractioninterface;

abstract class DieselMachine
{
	public DieselMachine()
	{
		System.out.println("Diesel MAchine :: Constructor");
	}
	
	public void start()
	{
		System.out.println("Machine Starting ....");
	}
	
	public abstract void fillFuel();
	
}
public class Machine extends DieselMachine {

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Filling fuel tank ....");
		
	}
	
	public static void main(String... args)
	{
		// Abstract class contains constructor but still object for abstract classes cannot be created
		// To create an object of abstract class, a subclass is required which does implement the abstract class.
		

	}
	
	
	
}
