package lecture52.staticimports;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 20;
		System.out.println(b);

		Byte b1 = new Byte(b); // Auto-boxing
		System.out.println(b1); // calls toString() method.
		
		byte b2 = b1; //Auto-unboxing
		System.out.println(b2);
		
		@SuppressWarnings("removal")
		Integer i = new Integer("30");
		Integer i2 = new Integer(21);
		Integer i4 = i +i2;
		System.out.println(i4);
	}

}
