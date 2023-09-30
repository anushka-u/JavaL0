package com.lecture51;

public class ThrowDemo {
	
	public String getName(int id) throws Exception
	{
		if(id ==1)
		{
			return "Rani";
		}
		else if(id ==2)
		{
			return "Raju";
		}
		else
		{
			throw new Exception("NameNotFound");
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int id =3;
		ThrowDemo d = new ThrowDemo();
		String Name1 = d.getName(1);
		System.out.println(Name1); //Will print correct name
		String Name = d.getName(id);
		System.out.println(Name); //will throw our own created Exception
	}

}
