package com.in.defaultinterface;

public interface Test {

	public abstract void Sum (int x, int y);
	
	default void Print() {
		System.out.println("I am default method present in Test Interface");
	}
}
