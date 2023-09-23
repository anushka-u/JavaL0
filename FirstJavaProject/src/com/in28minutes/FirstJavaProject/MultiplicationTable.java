package com.in28minutes.FirstJavaProject;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiplicationTable(6);
		
	}
	
	public static void printMultiplicationTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d*%d=%d",n,i,n*i).println();
		}
	}
	
	

}
