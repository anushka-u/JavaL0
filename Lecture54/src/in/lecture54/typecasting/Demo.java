package in.lecture54.typecasting;

public class Demo implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//child object
		Demo d = new Demo();
		Object obj = d;//Widening - Storing child class object in parent class
		
		Demo d1 = new Demo();
		Object object = d1.clone(); // cloning - getting parent object
		
		Demo d2 = (Demo)object; // narrowing - storing parent object in child object
		
	}

}
