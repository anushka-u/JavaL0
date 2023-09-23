package oops.java.com;

/*
 * Write JAva Method to return the object based on id
 * If id = 101 It should return Raju(101,Raju,33)
 * If id is 102 it should return Rani(102,Rani,30)
 */
public class RajuRaniData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RajuRaniData RRD = new RajuRaniData();
		Data d2 = RRD.get(102);
		System.out.println(d2.Name +"( " +d2.id+","+d2.Name+","+d2.age + " )" );

	}

	Data get(int id)
	{
		Data d = new Data();
		if(id == 101)
		{
			d.id =id;
			d.Name = "Raju";
			d.age = 32;
			return d;
		}
		else
		{
			d.id=id;
			d.Name = "Rani";
			d.age =30;
			return d;
		}
	}
}
class Data
{
	int id;
	String Name;
	int age;
}
