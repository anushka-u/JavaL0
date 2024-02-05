package com.in.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File myFile = new File ("D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\com\\in\\filehandling\\example.txt");
		try {
			FileReader fReader = new FileReader(myFile);
			BufferedReader bufferedReader = new BufferedReader(fReader);
			String line=bufferedReader.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line= bufferedReader.readLine();
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
