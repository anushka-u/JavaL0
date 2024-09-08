package ExamThree.com;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello, I love my India";
		char[] ch = s1.toCharArray();

		System.out.println("String with vowels in it is " + s1);
		String s2 = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				continue;
			}
			s2 += ch[i];
		}
//		System.out.println(Reverse("Anushka",""));

		//System.out.println("String after removing vowel is " + s2);

	}


}
