package oops_1;

public class EmployeeeThisKeywordDemo {
	public static void main(String args[])
	{
		Employeee emp = new Employeee();
		
		emp.registerEmployee();
		emp.sendForProcessing();
		
		System.out.println("*******updating employee Details******");
		emp.updateName("Rishwa");
		emp.updateSalary(15.5).displayDetails();
		emp.sendForProcessing();
	}
}
