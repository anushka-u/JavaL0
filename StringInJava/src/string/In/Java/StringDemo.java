package string.In.Java;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();

		// compareTo - returns negative/positive integer if string isn't same otherwise
		// returns 0
		int value = str1.compareTo(str2);
		System.out.println(value);

		// charAt - returns element present at the passed index
		System.out.println(str1.charAt(0));

		// compareToIgnoreCase - does ignore cases while comparing
		System.out.println(str1.compareToIgnoreCase(str2));

		// length() to find number of character in string
		System.out.println(str1.length());

		// IndexOf() returns first occurred index of the character
		System.out.println(str2.indexOf('l'));

		// contains - it checks whether our string contains that passed character in
		// argument or not
		System.out.println(str2.contains("ll"));

		// equals - to check whether two string are equal or not, so what equal
		// basically does is check the memory location of both object
		System.out.println(str1.equals(str2));

		// endsWith() - check if the string ends with that character or word or not
		System.out.println(str1.endsWith("llo"));

		// startsWith() check whether our string start with that word or not
		System.out.println(str2.startsWith("He"));

		// Replace() - used to replace something in string with another
		String str3 = str1.replace("ll", "p"); // Although we are replacing the value of str1
		// , below while printing we are still getting value of str1 as hello only
		// because String is immutable

		System.out.println(str3);
		System.out.println(str1);

		StringBuffer str4 = new StringBuffer("hello"); // Mutable string is being created now while manipulating the
		// string no new string will be created all modification and
		// manipulation will be done in one string only
		str4.replace(2, 4, "p");
		System.out.println(str4);

		StringBuffer stringBuffer = new StringBuffer("Pune Wale");
		System.out.println(stringBuffer.lastIndexOf("e"));

		System.out.println(stringBuffer.substring(1, 4));
	}

}
