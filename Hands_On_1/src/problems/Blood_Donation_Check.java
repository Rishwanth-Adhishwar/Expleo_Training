package problems;

import java.util.Scanner;

public class Blood_Donation_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Age: ");
		int age=sc.nextInt();
		
		System.out.print("Enter the Weight: ");
		double weight=sc.nextDouble();
		
		if(age>18 && age<55)
		{
			if(weight>45)
			{
				System.out.println("You are eligible for donating Blood");
			}
			else
			{
				System.out.println("You are under Weight,so you are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("You are not elgible for donating blood");
		}

	}

}
