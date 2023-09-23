package string.In.Java;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The String objects created using StringBuffer and StringBuilder are mutable,
		// in which one is Thread safe and another isn't thread safe.

		StringBuffer sBuffer = new StringBuffer("hello");
		sBuffer.append(", let's go and have some drink.");
		System.out.println(sBuffer);

		sBuffer.getChars(0, 7, sBuffer, 1);
		System.out.println(sBuffer);

	}

}
