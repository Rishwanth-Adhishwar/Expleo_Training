package functions;

import java.util.Scanner;

public class OddEvenSum {
	
	
	public static void oddEvenSum(int n,int a[])
	{
		int oddSum=0,evenSum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				evenSum+=a[i];
			}
			else
			{
				oddSum+=a[i];
			}
		}
		
		System.out.print("The Sum Odd Numbers: "+oddSum);
		System.out.print("\nThe Sum Even Numbers: "+evenSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.print("Enter the Array Elements: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		oddEvenSum(size,a);

	}

}
