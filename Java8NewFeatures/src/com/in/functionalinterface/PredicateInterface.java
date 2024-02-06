package com.in.functionalinterface;
import java.util.ArrayList;
import java.util.function.*;
public class PredicateInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> predicate  = (i) -> i>10;
		
		System.out.println(predicate.test(19));
		System.out.println(predicate.test(1));
		
		String[] names = {"Anushka","Anuradha","Kopal","Sumit"};
		Predicate<String> predicate2 = s -> s.startsWith("A");
		
		for(String name: names)
		{
			if(predicate2.test(name))
			{
				System.out.println(name);
			}
		}
	}

}
