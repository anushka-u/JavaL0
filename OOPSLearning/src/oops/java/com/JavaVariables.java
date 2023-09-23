package oops.java.com;

public class JavaVariables {

	int a = 43;
	static String Institute;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Variables are divided into three types
		 * Global Variable
		 * Static Variable
		 * Local Variable
		 * Every class in java can be used as a data type
		 */
		//Global Variable
		/**System.out.println(a);
		 * The above line of code will give an error because untill unless we don't create an object
		 * for class our instance variable or to be more precise our global variable will have no memory
		 * 
		 * Global variables cannot be accessed in static method directly , if you want to access an instance variable in static method
		 * you have to call it using an object
		 */
		JavaVariables Jv = new JavaVariables();
		Jv.a = 32;
		System.out.println(Jv.a);
		
		/** Static Variable
		 * Variables which are declared inside the class and outside the method with static keyword is known as static variable
		 * Static method can be accessed only by using class name
		 * For static variable memory will be allocated only once
		 */
		
		JavaVariables.Institute ="Technocrats";
		System.out.println(Jv.Institute);
		
		
		/**
		 * Local Variable
		 * It is declared inside the method, Constructor,block
		 * It lives till the method execution only
		 * Memory for local variable will be created when the method will be executing, After methos execution will be completed
		 * the variable will be deleted from memory
		 */
		
		int apj = 45;
		System.out.println(apj);
	}

}
