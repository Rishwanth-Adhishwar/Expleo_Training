package arrays_problems;

import java.util.Scanner;

public class Mark_Searching_count_Number_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[25];
		System.out.print("Enter the array elements: ");
		
		for(int i=0;i<25;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the Key Element to Search: ");
		int key=sc.nextInt();
		
		int c=0;
		
		for(int i=0;i<25;i++)
		{
			if(a[i]==key)
			{
				c++;
			}
		}
		System.out.println("The Key Element "+key+" Presents "+c+" times");

	}

}
