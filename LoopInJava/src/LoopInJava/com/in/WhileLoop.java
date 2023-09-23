package LoopInJava.com.in;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = 1;

		while (i <= num) {
			System.out.println(i);
			i += 1;
		}
	}

}
