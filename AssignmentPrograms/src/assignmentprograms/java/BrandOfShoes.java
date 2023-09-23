package assignmentprograms.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BrandOfShoes {

	public static void main(String[] args) throws Exception {
		// Based on the brand print slogan

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String brandOfShoes = bufferedReader.readLine();
		System.out.println(brandOfShoes);

		if (brandOfShoes.equals("NIKE"))
			System.out.println("Just Do It!");
		else if (brandOfShoes.equals("Adidas"))
			System.out.println("Impossible is Nothing");
		else if (brandOfShoes.equals("PUMA"))
			System.out.println("Forever Faster");
		else if (brandOfShoes.equals("Reebok"))
			System.out.println("I Am What I Am");
		else
			System.out.println("Your brand isn't in list");

	}
}