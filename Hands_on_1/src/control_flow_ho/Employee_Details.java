package control_flow_ho;

import java.util.Scanner;

public class Employee_Details { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//created object for Scanner class
		
		System.out.print("Enter Employee Name: ");
		String name=sc.next();
		
		System.out.print("Enter Wages of Employee: ");
		double wages=sc.nextDouble();
		
		System.out.print("Enter Number of days the Employee Work: ");
		int daysWorked=sc.nextInt();
		
		
		double totalSalary=wages*daysWorked;
		System.out.println("The Total salary of Employee is: "+totalSalary);
		
		sc.close();
	}

}
