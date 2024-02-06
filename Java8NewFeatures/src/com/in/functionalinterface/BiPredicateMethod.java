package com.in.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<String, Integer> bi = (x,y)->{
			return x.length() == y;
		};
		
		System.out.println(bi.test("Karan", 5));
		System.out.println(bi.test("Ashmita", 4));		
	}

}
