package arrays_problems;

import java.util.Scanner;

public class Removing_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:  ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.print("Enter the array elements: ");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=Integer.MAX_VALUE;
					c++;
					
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=Integer.MAX_VALUE)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
