package com.in.optionalcd;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words  =  new String[10];
		
//		//It will give an nullpointerexception error
//		String word = words[5].toLowerCase();
//		System.out.println(word);
//		
		//To overcome the nullpointerexception we do have one optional class in java
		
		Optional<String> checkIfNullOptional= Optional.ofNullable(words[5]);
		
		if(checkIfNullOptional.isPresent())
		{
			String wordString = words[5].toLowerCase();
			System.out.println(wordString);
		}
		else {
			System.out.println("Word is Null");
		}

	}

}
