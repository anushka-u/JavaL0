package ExamThree.com;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "I love Java Programming";
		String[] arr = s1.split(" ");

		System.out.println(arr.length);

		String s2 = " I    Am      Beautiful";
		String brr[] = s1.split("//s");
		System.out.println(brr.length);
	}

}
