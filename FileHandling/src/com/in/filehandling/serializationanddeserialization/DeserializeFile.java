package com.in.filehandling.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fIs = new FileInputStream("D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\com\\in\\filehandling\\serializationanddeserialization\\EmployeeDetail.txt");
			 ObjectInputStream ois = new ObjectInputStream(fIs);
			 Object object = ois.readObject();
			 Employee p1 = (Employee)object;
			 System.out.println("Id is "+p1.empId);
			 System.out.println("Name is "+p1.name);
			 ois.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
