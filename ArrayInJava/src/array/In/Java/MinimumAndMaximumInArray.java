package array.In.Java;

import java.util.Scanner;

public class MinimumAndMaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int Minimum = arr[0];
		int Maximum = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] < Minimum) {
				Minimum = arr[i];
			}

			if (arr[i] > Maximum) {
				Maximum = arr[i];
			}
		}
		//		Arrays.sort(arr);
		//		System.out.println("Minimum in array is " + arr[0]);
		//		System.out.println("MAximum in array is " + arr[n - 1]);

		System.out.println("Minimum in array is " + Minimum);
		System.out.println("Maximum in array is " + Maximum);
		scanner.close();
	}
	

}
