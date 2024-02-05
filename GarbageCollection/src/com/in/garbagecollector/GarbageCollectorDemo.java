package com.in.garbagecollector;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectorDemo demo1 = new GarbageCollectorDemo();
		System.out.println("Demo1 object has been created");
		
		GarbageCollectorDemo demo2 = new GarbageCollectorDemo();
		System.out.println("Demo2 object has been created");
		
		demo1=demo2;
		demo2=demo1;
		
		demo1=null;
		demo2=null;
		
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("The object are eligible for garbage collection ");
	}
}
