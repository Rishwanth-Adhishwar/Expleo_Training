package functions;

import java.util.Scanner;

public class OverTimePay {
	
	public static double overTimePay(int workHours)
	{
		if(workHours>40)
		{
			return (workHours-40)*15;
		}
		else
		{
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Working Hours: ");
		int workingHours=sc.nextInt();
		
		double pay = overTimePay(workingHours);
		
		System.out.println("The OverTime Pay is : "+pay);
		

	}

}
