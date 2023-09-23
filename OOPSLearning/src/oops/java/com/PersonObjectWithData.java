package oops.java.com;
public class PersonObjectWithData {

	public static void main(String[] args)
	{
		PersonObjectWithData psod = new PersonObjectWithData();
		//The get method is returning an object so to store the value of object we are creating another object
		Person z = psod.get();
		//Printing the output we have received from get() method inside the driver code
		System.out.println(z.id + " " +z.Name+ " "+z.age);
	}
	
	/**
	 * To return multiple value from a method we should go with Object return type
	 * In below method
	 * Our method isn't taking any input 
	 * but giving output
	 */
	Person get()
	{
		Person P = new Person();
		P.id =101;
		P.Name = "Tanuja";
		P.age = 21;
		return P;
	}
}
class Person{
	int id;
	String Name;
	int age;
	
}
