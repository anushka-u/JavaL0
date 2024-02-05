package com.in.reflectionapi;

import java.lang.reflect.Field;

class Student{
	private int stuId;
	String name;
	
}
public class AccessPrivateVariable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clz=Class.forName("com.in.reflectionapi.Student");
		System.out.println(clz);
		
		Object instance = clz.newInstance();
		Student stu=(Student)instance;
		
		Field fldField = clz.getDeclaredField("stuId");
		fldField.setAccessible(true);
		fldField.set(stu,1);
		System.out.println(fldField.get(stu));
	}

}
