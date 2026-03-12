package class_object;

 class Main {
	
	//Instance variables
	int empId;
	String empName;
	
	void setEmployeeDetails(int id,String name)
	{
		empId=id;
		empName=name;
	}
	
	void getEmployyeDetails()
	{
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
	}

}

public class Employee {
	public static void main(String[] args) {
		
		Main E1=new Main();//first object creation
		Main E2=new Main();//Second object creation
		
		E1.setEmployeeDetails(1001, "Ravi");
		E2.setEmployeeDetails(1002, "Shyam");
		
		E1.getEmployyeDetails();
		E2.getEmployyeDetails();
		
	}
}



