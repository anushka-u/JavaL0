package com.in.generic;

public class GenericClassProgram<T> {
	T ob;
	
	public GenericClassProgram(T obj) {
		ob = obj;
	}
	
	public T getObject() {
		return ob;
	}
	public static void main(String[] args) {
		
		GenericClassProgram<Integer> genericClassProgram= new GenericClassProgram<Integer>(100);
		int x = genericClassProgram.getObject();
		System.out.println(x);
		
		GenericClassProgram<String> genericClassProgram2 = new GenericClassProgram<String>("Pushpa");
		String name= genericClassProgram2.getObject();
		System.out.println(name);
	}
}
