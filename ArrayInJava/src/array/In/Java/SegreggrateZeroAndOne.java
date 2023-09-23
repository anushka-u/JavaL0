package array.In.Java;

public class SegreggrateZeroAndOne {

	public static void main(String[] args) {
		// Segregate 0 and 1

		int[] arr = { 1, 1, 0, 0, 1 };
		int low = 0;
		int high = 4;
		while (low != high) {
			if (arr[low] == 0) {

				low++;
			} else if (arr[low] == 1) {
				while (arr[high] == 1) {
					high--;

				}
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
			}
		}
		for (int a : arr) {
			System.out.printf(a + " ");
		}
	}

}
