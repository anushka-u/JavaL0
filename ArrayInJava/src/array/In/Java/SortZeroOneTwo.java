package array.In.Java;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		// Sort 0,1,2

		int[] arr = { 0, 1, 2, 2, 1, 2, 0 };
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				c1++;
			} else if (arr[i] == 1) {
				c2++;
			} else {
				c3++;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		for (int i = 0; i < c1; i++) {
			arr[i] = 0;
		}
		for (int i = c1; i < c1 + c2; i++) {
			arr[i] = 1;
		}
		for (int i = c1 + c2; i < c1 + c2 + c3; i++) {
			arr[i] = 2;
		}

		for (int a : arr) {
			System.out.printf(a + " ");
		}

	}

}
