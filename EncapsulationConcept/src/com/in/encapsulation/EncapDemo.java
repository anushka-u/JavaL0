package com.in.encapsulation;

public class EncapDemo {

	private int id;
	private String name;
	private int age;
	//Getter method : Used to get the data
	public int getId() {
		return this.id;
	}
	//Setter method : Used to set the data
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public EncapDemo(int id, int age,String name){
		this.setAge(age);
		this.setId(id);
		this.setName(name);
	}
	
	public void printDetails()
	{
		System.out.println(this.name + "'s age is " + this.age + " and id is "+this.id );
	}
	
}
