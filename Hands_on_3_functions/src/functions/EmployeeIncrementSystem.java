package functions;

import java.util.Scanner;

public class EmployeeIncrementSystem {
	
	
	public static void appraiselOne(double salary,float rating)
	{
		double newSalary=salary+(salary*0.10);
		System.out.println(newSalary);
	}
	public static void appraiselTwo(double salary,float rating)
	{
		double newSalary=salary+(salary*0.25);
		System.out.println(newSalary);
	}
	public static void appraiselThree(double salary,float rating)
	{
		double newSalary=salary+(salary*0.30);
		System.out.println(newSalary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee Salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("Enter the rating of an Employee: ");
		Float rating=sc.nextFloat();
		
		if(salary<=0 || rating<1 || rating>10)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			if(rating>=1 && rating<=4)
			{
				appraiselOne(salary,rating);
			}
			else if(rating>4 && rating<=7)
			{
				appraiselTwo(salary,rating);
			}
			else if(rating>7 && rating<=10)
			{
				appraiselThree(salary,rating);
			}
		}
		
	}


}
