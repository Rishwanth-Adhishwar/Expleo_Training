package arrays_problems;

import java.util.Scanner;

public class Dice_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int n=sc.nextInt();
		
		int arun[]=new int[n];
		int naveen[]=new int[n];
		
		int sum1=0,sum2=0;
		
		System.out.println("Enter Aruns Choice: ");
		for(int i=0;i<n;i++)
		{
			arun[i]=sc.nextInt();
			sum1+=arun[i];
		}
		
		System.out.println("Enter Naveens Choice: ");
		for(int i=0;i<n;i++)
		{
			naveen[i]=sc.nextInt();
			sum2+=naveen[i];
		}
		
		if(sum1>sum2)
		{
			System.out.println("Arun Wins!!!");
		}
		else
		{
			System.out.println("Naveen Wins!!!");
		}

	}

}
