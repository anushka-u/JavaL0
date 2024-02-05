package com.in.reflectionapi;

class Employe{
	int id;
	String name;
}
public class ForNameClassDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class nameClass= Class.forName("com.in.reflectionapi.Employe");
		System.out.println(nameClass);
		
		Object instanceObject = nameClass.newInstance();
		Employe employee = (Employe)instanceObject;
		System.out.println(employee);
		
		nameClass = Class.forName("java.lang.String");
		System.out.println(nameClass);
	}

}
