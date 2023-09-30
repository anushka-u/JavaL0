package com.lecture51;


//Infinite calls will happen, will get error as Stack Overflow error
//Error are those which cannot be handled by exception
public class Demo {
	void m1()
	{
		m2();
	}
	void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo();
		d.m1();
	}

}
