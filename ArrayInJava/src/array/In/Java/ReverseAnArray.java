package array.In.Java;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int j = 0;
		int k = n - 1;
		while (j != n / 2) {
			int temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			j++;
			k--;
		}
		for (int a : arr) {
			System.out.println(a);
		}
		scanner.close();
	}

}
