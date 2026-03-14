package control_flow_ho;

import java.util.Scanner;

public class Perfect_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		int i=1,j=1,k=1;
		if(n>=1)
		{
			while(i<n)
			{
				i=i*(j+1);
				j++;
				k++;
			}
			if(i==n)
			{
				System.out.println(k);
			}
			else
			{
				System.out.println("Sorry the given number is not a perfect Factorial");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}


	}

}
