//Write a Java Method to return College data
package oops.java.com;

public class DriverClg {
//The reason why we aren't declaring object in main method is
	//Because the main method isn't giving the output, we are creating object i method which is giving the output.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverClg  dc =  new DriverClg();
		College clgData = dc.getdata();
		System.out.println(clgData.id + " " + clgData.Name);
	}
	
	College getdata()
	{
		College clg = new College();
		clg.id = 1;
		clg.Name = "Technocrats";
		return clg;
	}
}
class College{
	int id;
	String Name;
}
