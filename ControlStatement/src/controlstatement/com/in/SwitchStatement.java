package controlstatement.com.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchStatement {

	public static void main(String[] args) throws Exception {
		// Take Input from user and print day of the week in output

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(inputStreamReader);
		String number = bReader.readLine();
		int num = Integer.parseInt(number);

		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No Day Found");
		}

	}

}
