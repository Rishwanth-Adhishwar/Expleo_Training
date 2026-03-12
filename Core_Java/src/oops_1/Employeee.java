package oops_1;


class Employeee {
	
	int empId;
	String empName;
	double empSalary;
	
	//using this to refer instance variable
	Employeee(int empId,String empName,double empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		System.out.println("Employee Record created Successfully");
	}
	
	//using this to call another Constructor (constructor chaining)
	Employeee()
	{
		this(101,"RISHWA",8000);//calls parameterized constructor
		System.out.println("Default Constructor called - initialized with default data \n");
	}
	
	//using this to call another method in the same class
	void registerEmployee()
	{
		System.out.println("Registring Employee");
		this.displayDetails();
	}
	
	void displayDetails()
	{
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("EMployee Salary: "+empSalary);
	}
	
	//using this to pass current object as an argument
	
	void sendForProcessing()
	{
		HRDepartment hr = new HRDepartment();
		hr.processEmployee(this);
	}
	
	//using this to return current object (method chaining)
	Employeee updateSalary(double hikePercentage)
	{
		this.empSalary=empSalary+(empSalary*hikePercentage/100);
		return this;//Allows changing
	}
	
	Employeee updateName(String newName)
	{
		this.empName=newName;
		return this;//Allows changing
	}
}

//helper class represents another department
class HRDepartment{
	
	void processEmployee(Employeee e)
	{
		System.out.println("HR Department Processing Employee");
		System.out.println("Processed Employee "+e.empName+ "with Salary "+e.empSalary+ "\n");
	}
}



	

