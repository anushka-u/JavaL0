package com.in.filehandling.serializationanddeserialization;

import java.io.Serializable;

public class Employee implements Serializable{

	public int empId;
	
	public String name;
	
	public Employee(int id, String empName) {
		this.empId = id;
		this.setName(empName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
