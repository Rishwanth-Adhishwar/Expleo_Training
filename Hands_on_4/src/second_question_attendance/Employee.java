package second_question_attendance;

import java.util.Scanner;

public class Employee {
	
	private int empId ; 
	private String empName ; 
	
	Scanner sc = new Scanner(System.in);
	public void markCheckIn (Attendence attendence)
	{
		System.out.print("Enter the Employee Id: ");
		
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the Employee Name: ");
		String name = sc.nextLine();
		
		this.empId = id;
		this.empName = name;
		
		attendence.setEmpId(empId);
		
		if (attendence.markCheckIn())
		{
			System.out.println("sucessfully CheckedIn ");
			
			System.out.println(attendence.toString());
		}
		else 
		{
			System.out.println("Please Checkout to Checkin");
		}	
		
	}
	
	public void markCheckOut (Attendence attendence)
	{
		System.out.print("Enter the Employee Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		if (attendence.getEmpId()!=id )
		{
			System.out.println("No Employee in that id");
			return;
		}
		
		if (attendence.markCheckOut())
		{
			System.out.println("Successfully Exited");
			
			System.out.println(attendence.toString());
		}
		
		else
		{
			System.out.println("Pls first check in");
		}
	}
}
