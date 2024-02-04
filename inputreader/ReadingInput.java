package com.in.inputreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingInput {

	public static void main(String... args) throws IOException
	{/**
	We can read input from keyboard in two ways 
	1- By using Scanner class
	2- By using BufferReader class
	*/
		Scanner scanner  = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(i);
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String nameString  = bufferedReader.readLine();
		System.out.println(nameString);
		
				
				
	}
	
}
