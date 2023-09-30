package com.lecture51;

public class UserExceptionDemo extends RuntimeException {

	public UserExceptionDemo()
	{
		
	}
	public UserExceptionDemo(String msg)
	{
		super(msg);
	}
}
