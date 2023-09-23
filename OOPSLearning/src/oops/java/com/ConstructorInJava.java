package oops.java.com;

public class ConstructorInJava {

	int id;
	int age;
	String Name;
	String College;
	
	//Parameterized Constructor
	public ConstructorInJava(int id,int age,String Name,String College)
	{
		this.id = id;
		this.age=age;
		this.Name=Name;
		this.College = College;
		
	}
	 //Non Parameterized Constructor
	public ConstructorInJava()
	{
		this.id = id;
		this.age=age;
		this.Name = Name;
		this.College = College;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		ConstructorInJava Raju = new ConstructorInJava(101,23,"Raju","TIT");
		System.out.println(Raju.id + " "+ Raju.Name+" "+Raju.age+" "+Raju.College);
		
		ConstructorInJava Rani = new ConstructorInJava(102,22,"Rani","TIT");
		System.out.println(Rani.id + " "+ Rani.Name+" "+Rani.age+" "+Rani.College);
		
		ConstructorInJava Vidhya = new ConstructorInJava();
		Vidhya.id = 103;
		Vidhya.age = 21;
		Vidhya.Name="Vidhya";
		Vidhya.College = "TIT";
		System.out.println(Vidhya.id + " "+ Vidhya.Name+" "+Vidhya.age+" "+Vidhya.College);

	}

}
