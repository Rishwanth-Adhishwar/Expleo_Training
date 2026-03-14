package functions;

import java.util.Scanner;

public class BloodDonation {
	
	public void bloodDonateCheck(int age,double weight)
	{
		if(age>18 && age<=55 && weight>45)
		{
			System.out.println("You are eligible for donating Blood");
		}
		else
		{
			System.out.println("You are not eligible for Donating Blood");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Age: ");
		int age=sc.nextInt();
		
		System.out.print("Enter youe Weight: ");
		double weight=sc.nextDouble();
		
		BloodDonation bd=new BloodDonation();
		bd.bloodDonateCheck(age,weight);

	}

}
