package in.lecture54.typecasting;

import java.util.Scanner;

public class First {
	
	public static void main(String... args)
	{
	byte b=20;
	int i = b; // Widening or UpCasting
	System.out.println(i);
	
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.nextLine();
	String s2 = scanner.nextLine();
	
	int a = Integer.parseInt(s1);
	int z = Integer.parseInt(s2);
	
	System.out.println(a+z);	
	
	
	}
}
