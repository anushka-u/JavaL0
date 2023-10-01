package lecture52.staticimports;

public class Calculator {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public int add(int... a)
	{
		int sum=0;
		for(int i :a)
		{
			sum+=i;
		}
		return sum;
	}
//	Invalid - A method can have only one variable argument
//	public void m1(String...s, int...i)
//	
	
//public void(int ...i, int j) // invalid coz variable argument should be the ;last argument in method
	
	public void m2(int i, int ...j)
	{
		System.out.println("M2 Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator addNumbers = new Calculator();
		int ans = addNumbers.add(5,3,2,1,6,7);
		System.out.println(ans);

		addNumbers.m2(2,5,67,8);
	}

}
