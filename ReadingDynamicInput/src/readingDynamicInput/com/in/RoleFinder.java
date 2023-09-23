package readingDynamicInput.com.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoleFinder {

	public static void main(String[] args) throws IOException {
		// A in the string

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String string = bufferedReader.readLine();

		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'A') {
				continue;
			} else {
				newString += string.charAt(i);
			}
		}
		System.out.println(newString);

	}

}
