package com.lecture51;

public class DemoOfUserException {

	private String getName(int id) throws Exception
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
			throw new UserExceptionDemo("Invalid Id");
		}
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoOfUserException d= new DemoOfUserException();
		d.getName(101);

	}

}
