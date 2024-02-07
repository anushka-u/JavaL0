package com.in.streamapi;

public class Person {

	public int id;
	public String position;
	public int age;
	public Person(int id, String position, int age) {
		super();
		this.id = id;
		this.position = position;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+ " " + this.position +" " + this.age;
	}
}
