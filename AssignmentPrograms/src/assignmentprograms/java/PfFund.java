package assignmentprograms.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PfFund {

	public static void main(String[] args) throws Exception {
		// Calculate PF of an employee
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int salary = Integer.parseInt(bufferedReader.readLine());

		int pf = (12 * salary) / 100;

		System.out.printf("Proficient fund of employee is %d", pf);

	}

}
