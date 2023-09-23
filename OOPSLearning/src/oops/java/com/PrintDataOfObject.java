package oops.java.com;
// Write a Java Method to print data of Object
public class PrintDataOfObject {
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.id = 101;
		s1.Name = "Anuradha";
		s1.Print();
	}
	
	void printData(Student s)
	{
		System.out.println(s.id + " " + s.Name);
	}
}
class Student
{
	int id;
	String Name;
	
	void Print()
	{
		System.out.println(id+" "+Name);
	}
}

