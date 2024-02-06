package com.in.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner stringJoiner = new StringJoiner("-");
		stringJoiner.add("Anushka");
		stringJoiner.add("Upadhyay");
		
		System.out.println(stringJoiner);
		
		//If you want to join with prefix and suffix
		StringJoiner myJoiner = new StringJoiner("-","(",")");
		myJoiner.add("Anushka");
		myJoiner.add("Upadhyay");
		System.out.println(myJoiner);
	}

}
