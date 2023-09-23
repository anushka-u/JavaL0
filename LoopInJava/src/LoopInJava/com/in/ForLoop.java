package LoopInJava.com.in;

import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		// Print elements from 1 to n
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}

