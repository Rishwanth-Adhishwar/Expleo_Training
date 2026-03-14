package functions;

import java.util.Scanner;

public class SumOfOddEvenDifference {
	
	public static void oddEvenSum(int start,int end)
	{
		int  evenSum=0,oddSum=0,difference=0;
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				evenSum+=i;
			}
			else
			{
				oddSum+=i;
			}
		}
		System.out.println("The Number of oddSum is: "+oddSum);
		System.out.println("The Number EvenSum is: "+evenSum);
		System.out.println("The Differnce Between them is: "+(evenSum-oddSum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting value: ");
		int start=sc.nextInt();
		
		System.out.println("Enter the Ending value: ");
		int end=sc.nextInt();
		oddEvenSum(start,end);
		

	}

}
