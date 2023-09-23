package branching.com.in;

import java.util.Scanner;

public class BranchingStatementDemo {

	public static void main(String[] args) {
		// Branching Statement in Java
		/*
		 * Break Return Continue
		 */
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(demoMethod(a, b));

	}

	public static int demoMethod(int a, int b) {
		/*
		 * while (a < b) { if (a == 5) { System.out.println(
		 * "I am going to Execute the continue statement because I want to skip execution for number 5"
		 * ); a++; continue; } System.out.println(a); a++; } System.out.println();
		 * System.out.println("A demo for break");
		 * 
		 * a = b - a;
		 */

		while (a != b) {
			if (a == 5) {
				System.out.println("It's a demo for break statement so breaking out from loop when a is 5");
				break;
			}
			System.out.println(a);
			a++;
		}

		System.out.println();
		System.out.println("The methos is returning addition of a and b");
		return a + b;

	}

}
