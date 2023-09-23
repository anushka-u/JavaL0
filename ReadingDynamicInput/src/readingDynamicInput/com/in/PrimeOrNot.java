package readingDynamicInput.com.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOrNot {

	public static void main(String[] args) throws IOException {
		// Any number divisible by itself or one is considered as Prime number

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(inputStreamReader);
		String numberString = bReader.readLine();
		int number = Integer.parseInt(numberString);
		int i = 2;
		boolean flag = false;
		while (i != number / 2) {
			if (number % i == 0) {
				flag = true;
			}
			i++;
		}
		if (flag) {
			System.out.println("Not a Prime");
		} else {
			System.out.println("Prime Number");
		}

	}

}
