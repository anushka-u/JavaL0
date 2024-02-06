package com.in.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> function = (str) -> str.length();
		System.out.println(function.apply("Suneeta"));

		Function<String, Integer> function2= (str) -> str.length() - str.replace(" " , "").length();
		System.out.println(function2.apply("Anushka, A    Very   Very    Good    Morning"));
		
	}

}
