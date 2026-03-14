package exceptionHandling;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter the Employee ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			
			if(id<=0)
			{
				throw new Exception("InvalidEmployeeNumberException");
			}
			
			System.out.print("Enter the Name: ");
			String name=sc.nextLine();
			
			System.out.print("Enter the D.O.B(DD.MM.YYYY) Format: ");
			String dob=sc.nextLine();
			
			String s[]=dob.split("\\.");
			
			int year=Integer.parseInt(s[s.length-1]);
			
			System.out.print("Enter the Date of Appointment(DD.MM.YYYY) Format: ");
			String doa=sc.nextLine();
			
			String s1[]=doa.split("\\.");
			
			int year1=Integer.parseInt(s1[s1.length-1]);
			
			int experience=2026-year1;
		

			if(year>=year1)
			{
				throw new Exception("InvalidDateOfJoinException");
			}
		
				System.out.println("Employee ID: "+id);
				System.out.println("Employee Name: "+name);
				System.out.println("Employee D.O.B: "+dob);
				System.out.println("Employee Join Date: "+doa);
				System.out.println("Employee Experience: "+experience);
			

			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
