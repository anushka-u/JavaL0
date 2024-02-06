package com.in.forEach;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	String name;
	
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" " + this.name;
	}
}

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> arr = new ArrayList<Employee>();
		
		arr.add(new Employee(1, "Anushka"));
		arr.add(new Employee(2, "Sumit"));
		arr.add(new Employee(3, "Prachi"));
		
		arr.forEach(emp->{
			System.out.println(emp.toString());
		});
	}

}
