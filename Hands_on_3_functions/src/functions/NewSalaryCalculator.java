package functions;

import java.util.Scanner;

public class NewSalaryCalculator {
	
	public static double newSalaryCalculator(double oldSalary,int hike)
	{
		return oldSalary+(oldSalary*hike/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the old Salary: ");
		double oldSalary=sc.nextDouble();
		
		System.out.print("Enter the Hike Percentage: ");
		int hike=sc.nextInt();
		
		double newSalary=newSalaryCalculator(oldSalary,hike);
		
		System.out.println("The New Salary is: "+newSalary);

	}

}
