package com.in.polymorphism;
class Animal{
	void talk()
	{
		System.out.println("I am an animal, I can talk but I am leaving it upto you to decide which animal you want to talk");
	}
}

public class Dog extends Animal{
	void talk()
	{
		System.out.println("Bhaw Bhaw");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog D1 = new Dog();
		D1.talk(); //When there is overriding and we create object of child class then child class method will be prioritized if it will have one otherwise will check in parent class
		
		Animal an = new Animal();
		an.talk(); // object of parent class, so method inside parent class will be called

	}

}
