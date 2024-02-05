package com.in.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\First.txt");
		try {
			Scanner scnScanner = new Scanner(myFile);
			while(scnScanner.hasNext())
			{
				String lineString = scnScanner.nextLine();
				System.out.println(lineString);
			}
			scnScanner.close();
		    }catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("We are done!");

	}

}
