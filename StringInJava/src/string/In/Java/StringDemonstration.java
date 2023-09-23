package string.In.Java;

public class StringDemonstration {
	
	public static void main(String[] args) {
		// Here What does happens is when we try to manipulate the value of string, it does create another string in our scp and start pointing to it without changing the value of s.
		
		String s = "Navin";
		s = s+" Reddy";
		System.out.println(s);
		
		StringBuilder sbuilder = new StringBuilder("Hello");
		sbuilder.append(" p");
		System.out.println(sbuilder);
	}

}
