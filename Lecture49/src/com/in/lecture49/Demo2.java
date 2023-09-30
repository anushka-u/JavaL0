package com.in.lecture49;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() method started....");
		try {
			String s = null;
			System.out.println(s.length()); // will throw nullpointerException
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main() method ended....");

	}

}
