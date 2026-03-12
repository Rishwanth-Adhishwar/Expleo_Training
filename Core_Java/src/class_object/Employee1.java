package class_object;

public class Employee1 {
	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 E1[]=new Employee1[2];
		
		for(int i=0;i<E1.length;i++)
		{
			E1[i]=new Employee1();
		}
		
		E1[0].setEmployeeDetails(1, "malar");
		E1[0].getEmployyeDetails();
		
		E1[1].setEmployeeDetails(2, "Jay");
		E1[1].getEmployyeDetails();	

	}

}
