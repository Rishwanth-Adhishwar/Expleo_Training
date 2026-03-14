package control_flow_ho;

import java.util.Scanner;

public class Web_Browsing_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double oneHour=50;
		double oneMinute=1;
		double fiveHours=200;
		double bill=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Browsing Hours: ");
		int hours = sc.nextInt();
		
		System.out.print("Enter Browsing Minutes: ");
		int minutes=sc.nextInt();
		
		if(hours>7 || (hours==7 && minutes>0))
		{
			System.out.println("Your Browsing Hours exceeded");
		}
		else
		{
			if(hours==5)
			{
				bill=fiveHours+(minutes*oneMinute);
				System.out.println("The Total bill for Browsing is: "+bill);

			}
			else if(hours==6)
			{
				bill=fiveHours+oneHour+(minutes*oneMinute);
				System.out.println("The Total bill for Browsing is: "+bill);

			}
		}
			

	}

}
