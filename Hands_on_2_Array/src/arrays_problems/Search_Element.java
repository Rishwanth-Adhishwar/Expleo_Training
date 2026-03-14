package arrays_problems;

import java.util.Scanner;

public class Search_Element {

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
		
		System.out.print("Enter the Key Element to Search: ");
		int key=sc.nextInt();
		
		boolean isFound=false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				isFound=true;
			}
		}
		if(isFound)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		

	}

}
