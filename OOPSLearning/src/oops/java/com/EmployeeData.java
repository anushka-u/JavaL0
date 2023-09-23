package oops.java.com;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.id = 101;
		emp.salary = 30000;
		EmployeeData empd = new EmployeeData();
		empd.printData(emp);
	}

	void printData(Employee emp)
	{
		System.out.println("Employee id is "+emp.id + " and salary is "+emp.salary);
	}
}
class Employee{
	int id;
	long salary;
}
