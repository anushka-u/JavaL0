package com.lecture50;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		try {
			fr = new FileReader("WhatIsToLearnInExceptionHandling.txt");
			int itr =fr.read();
			System.out.println(itr);
			}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();	
		}
		finally
		{
			System.out.println("File not found");
			fr.close();
			
		}

	}

}
