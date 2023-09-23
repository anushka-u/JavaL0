package oops.java.com;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product prdct = new Product();
		prdct.productId = 101;
		prdct.ProductName ="Sandwich";
		prdct.ProductPrice = 45;
		
		Driver d = new Driver();
		d.printDataOfProduct(prdct);
	}
	void printDataOfProduct(Product prdct)
	{
		System.out.println("ProductId is "+ prdct.productId);
		System.out.println("Product Name is "+ prdct.ProductName);
		System.out.println("Product Price is "+ prdct.productId);
	}

}
class Product{
	int productId;
	String ProductName;
	double ProductPrice;
}
