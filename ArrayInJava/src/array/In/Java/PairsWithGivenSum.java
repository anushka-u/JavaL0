package array.In.Java;

import java.util.Scanner;

public class PairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int givenSum = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == givenSum) {
					System.out.println("Sum of " + arr[i] + " and " + arr[j] + " is equal to " + givenSum);
				}
			}
		}
	}

}
