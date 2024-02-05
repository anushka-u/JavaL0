package com.in.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myFile = new File("D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\First.txt");
		try {
			FileWriter fWriter = new FileWriter(myFile);
			fWriter.write("It's my first file");
			fWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("We are Done!!");
	}

}
