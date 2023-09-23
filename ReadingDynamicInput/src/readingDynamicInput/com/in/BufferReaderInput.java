package readingDynamicInput.com.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderInput {

	public static void main(String[] args) throws Exception {
		// Using BufferReader to read input from console
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter Your Number: ");
		String string = bufferedReader.readLine();
		int number = Integer.parseInt(string);

		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

}
