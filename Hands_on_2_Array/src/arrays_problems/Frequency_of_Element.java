package arrays_problems;

import java.util.Scanner;

public class Frequency_of_Element {

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
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==-1)
			{
				continue;
			}
			int c=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=-1;
				}
			}
			System.out.println(a[i]+" comes "+c+" times");
		}

	}

}
