package array.In.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickRevision {

	public static void main(String[] args) throws IOException {

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(inputStreamReader);
		String number = bReader.readLine();
		int n = Integer.parseInt(number);
		int[] Arr = new int[n];

		for (int i = 0; i < n; i++) {
			String input = bReader.readLine();
			Arr[i] = Integer.parseInt(input);
		}

		System.out.println("Input Taken");

		for (int i = 0; i < n; i++) {
			System.out.println(Arr[i]);
		}
		bReader.close();
	}


}
