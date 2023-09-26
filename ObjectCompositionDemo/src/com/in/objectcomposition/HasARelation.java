package com.in.objectcomposition;
class Engine
{
	int id;
	String NameOfEngine;
	String FuelType;
	
	void start()
	{
		System.out.println("Engine Starting ...");
	}
}
public class HasARelation {
	void drive()
	{
		Engine engine = new Engine();
		engine.start();
		System.out.println("Journey started");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HasARelation hasARelation = new HasARelation();
		hasARelation.drive();
		

	}

}
