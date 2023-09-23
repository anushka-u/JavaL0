package array.In.Java;

public class NonRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 1, 3, 4, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.printf(arr[i] + " ");
			}
		}
	}

}
