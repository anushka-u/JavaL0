package com.lecture50;

import java.io.FileReader;

public class ExceptionHandlingDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() method started....");
		try {
			System.out.println("Try MEthod started");
			String s = null;
			System.out.println(s.length()); // will throw nullpointerException
			System.out.println("Try Method Ended");
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Got Exception in trying so Catch method started and ended");
		}
		
		System.out.println("main() method ended....");

	}

}
