package ExamThree.com;

public class CountOfAJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";

		//		int countTwo = 0;
		//
		//		char chr[] = str.toCharArray();
		//		for (int i = 0; i < chr.length; i++) {
		//			if (chr[i] == 'a') {
		//				countTwo += 1;
		//			}
		//		}
		//		System.out.println("count of 'a' in word " + str + " is " + countTwo);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count += 1;
			}
		}
		System.out.println("Count of a in word " + str + " is " + count);

	}

}
