package ExamThree.com;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Take string as an input
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();

		StringBuffer str1 = new StringBuffer(s1).reverse();
		String str2 = new String(str1);

		System.out.println(str1);
		System.out.println(str2);

		if (s1.equals(str2)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
