package com.in.reflectionapi;

class Employee{
	int id;
	String name;
}
public class GetClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Class name= employee.getClass();
		
		System.out.println(name);
		
		name = "hello".getClass();
		System.out.println(name);

	}

}
