/**
 * Write a program to sort the elements of an array in sequence. 
 */

package arrays_problems;

import java.util.Scanner;

public class Sorting_Array_Sequence {

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
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("The Sorted Elements: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
