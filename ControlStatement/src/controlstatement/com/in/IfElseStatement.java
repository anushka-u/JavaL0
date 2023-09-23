/**
 *
 */
package controlstatement.com.in;

import java.util.Scanner;
public class IfElseStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		if (a > 0) {
			System.out.println("Positive Integer");
		} else {
			System.out.println("Negative Integer");
		}
	}

}
