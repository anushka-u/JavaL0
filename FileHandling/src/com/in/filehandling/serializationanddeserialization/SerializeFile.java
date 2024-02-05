package com.in.filehandling.serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class SerializeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee employee = new Employee(12, "Bharath");
			FileOutputStream fileOutputStream= new FileOutputStream("D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\com\\in\\filehandling\\serializationanddeserialization\\EmployeeDetail.txt");
			ObjectOutputStream oStreamWriter = new ObjectOutputStream(fileOutputStream);

			oStreamWriter.writeObject(employee);
			oStreamWriter.flush();
			oStreamWriter.close();
			System.out.println("Serialization successfull");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
