package functions;

import java.util.Scanner;

public class PrimeNumbersOnGivenCoordinates {
	
	public static void primePrint(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int start=sc.nextInt();
		
		System.out.println("Enter the ending value: ");
		int end = sc.nextInt();
		
		if(start<end)
		{
			primePrint(start,end);
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
