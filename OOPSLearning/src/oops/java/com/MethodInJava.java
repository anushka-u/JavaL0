package oops.java.com;

public class MethodInJava {
	/**
	 * Method are divided into two types 
	 * Instance Method - > Object Level Method
	 * Static Method -> Class Level Method
	 */

	public static void main(String ... args)
	{
		MethodInJava mIJ = new MethodInJava();
		mIJ.hello();
		MethodInJava.greeting();
	}
	//Instance Method
	
	void hello()
	{
		System.out.println("Hello, I am an instance method and can be called only by using object");
	}
	
	//Static Method
	
	static void greeting()
	{
		System.out.println("Greetings, I am a static method and can be called using class only");
	}
}
