package controlstatement.com.in;

import java.util.Scanner;
public class IFElseLadder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yearOfExperience;
		yearOfExperience = scanner.nextInt();
		if (yearOfExperience > 0 && yearOfExperience <= 2) {
			System.out.println("Associate");
		} else if (yearOfExperience > 2 && yearOfExperience <= 4) {
			System.out.println("Software Enginner");
		} else if (yearOfExperience > 4 && yearOfExperience <= 7) {
			System.out.println("Sr. Software Enginner");
		} else {
			System.out.println("Manager");
		}
	}

}
