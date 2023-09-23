package assignmentprograms.java;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = count - i; j >= 1; j--) {
				System.out.printf(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.printf("* ");
			}
			System.out.println();
		}

	}

}
