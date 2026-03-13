package problems;


import java.util.Scanner;

public class Gross_Salary_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the basicSalary: ");
		double basicSalary =sc.nextDouble();
		
		double hra=0;
		double da=0;
		double grossSalary=0;
		
		if(basicSalary<=10000)
		{
			hra=basicSalary*0.20;
			da=basicSalary*0.80;
		}
		else if(basicSalary>10000 && basicSalary<=20000)
		{
			hra=basicSalary*0.25;
			da=basicSalary*0.90;
		}
		else
		{
			hra=basicSalary*0.30;
			da=basicSalary*0.95;
		}
		
		grossSalary=basicSalary+hra+da;
		
		System.out.println("The Gross Salary is: "+grossSalary);
		
	}

}
