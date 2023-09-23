package LoopInJava.com.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// WAP to print below pattern
		/*
		 * // ----------
		 *
		 * * * * * * * * * * * // -----------
		 */

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int count = Integer.parseInt(bufferedReader.readLine());

		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}

	}

}
