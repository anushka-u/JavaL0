package com.in.filehandling;

import java.io.File;
import java.io.FileNotFoundException;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myfile = new File("D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\First.txt");
		if(myfile.delete())
		{
			System.out.println("I have deleted my "+ myfile.getName());
		}
		else {
			System.out.println("Some Issue has occurred");
		}
	}

}
