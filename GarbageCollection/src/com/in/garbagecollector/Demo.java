package com.in.garbagecollector;

public class Demo {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1 = null;
		
		System.gc();
	}

}
