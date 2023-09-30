package com.lecture51;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

	//by using throws keyword, I am ignoring the exception at compile time and it will occur at runtime.
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("abc.txt");

	}

}
