package arrays_problems;

import java.util.Scanner;

public class Max_Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		System.out.print("Enter the size of array:  ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.print("Enter the array elements: ");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>min)
			{
				max=a[i];
			}
			else
			{
				min=a[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
