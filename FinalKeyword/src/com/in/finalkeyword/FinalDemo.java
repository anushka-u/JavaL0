package com.in.finalkeyword;
final class Student{
	int id;
	String Name;
	
	public Student(int id, String Name)
	{
		this.id=id;
		this.Name = Name;
	}
	
	void detail()
	{
		System.out.println("My id is" + this.id + " My name is "+ this.Name);
	}
}
//The below line will give error because final class cannot be inherited because they don't want to be modified or reused
//class User extends Student
//{
//	
//}
class Employee{
	int id;
	final void Print()
	{
		System.out.println("Will not tell my id");
	}
}

class EmpInh extends Employee
{
	//The below action will throw error because method declared
	//using final keyword cannot be overridden.
//	void Print()
//	{
//		System.out.println("Will tell id");
//	}
}
public class FinalDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "Aaradhna");
		student.detail();
		
		

	}

}
