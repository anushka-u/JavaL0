package com.in.accessspecifier;

public class Test {
	
	public static void main(String... args)
	{
		Employee emp = new Employee();
		emp.m1();
		
		//PrivateEmployee class have private method() which cannot be accessed by object of privateEmployee.
		privateEmployee pemp = new privateEmployee();
		pemp.method2();
		
		//Protected Employee Class
		ProtectedEmployee proEmp = new ProtectedEmployee();
		proEmp.method();
		
	}

}
