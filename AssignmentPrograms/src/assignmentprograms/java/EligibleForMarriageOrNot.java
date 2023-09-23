package assignmentprograms.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EligibleForMarriageOrNot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int age = Integer.parseInt(bufferedReader.readLine());
		int salary = Integer.parseInt(bufferedReader.readLine());

		if (age < 30 && salary > 100000) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}

	}

}
