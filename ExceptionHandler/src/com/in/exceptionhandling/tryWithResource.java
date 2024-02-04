package com.in.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedReader bReader = new BufferedReader(new FileReader("d://myFile.txt"))){
			System.out.println("Try block executed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fine not found exception");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
