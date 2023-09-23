package ExamThree.com;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If all character of one string present in another string that strings as
		// known as Anagrams

		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();

		if (s1.length() != s2.length()) {
			System.out.println("Not an Anagram");
		}

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean flag = Arrays.equals(a, b);

		System.out.println(flag);

	}

}
