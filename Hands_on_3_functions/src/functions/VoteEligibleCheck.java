package functions;

import java.util.Scanner;

public class VoteEligibleCheck {
	
	public static boolean voteEligibility(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int Age=sc.nextInt();
		
		boolean res=voteEligibility(Age);
		
		if(res)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}
		

	}

}
