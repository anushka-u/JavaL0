package ExamThree.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseAString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter your string");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(inputStreamReader);
		String string = bReader.readLine();
		//Way 1
		//		StringBuffer s1 = new StringBuffer(string);
		//		s1.reverse();
		//		System.out.println(s1);

		// Way2
		String s3 = "";

		char ch[] = string.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			s3 += ch[i];
		}

		System.out.println(s3);

	}

}
