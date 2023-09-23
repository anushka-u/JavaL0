package ExamThree.com;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello My Friend";
		String[] s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			String xString = s2[i];
			StringBuffer stringBuffer = new StringBuffer(xString);
			System.out.print(stringBuffer.reverse() + " ");

		}

	}

}
