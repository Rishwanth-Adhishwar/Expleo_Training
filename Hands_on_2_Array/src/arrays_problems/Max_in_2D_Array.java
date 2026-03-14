package arrays_problems;

import java.util.Scanner;

public class Max_in_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Rows: ");
		int row=sc.nextInt();
		
		System.out.print("Enter the Colomns: ");
		int column=sc.nextInt();
		
		int[][] arr=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.print("Max Element is: "+max);
		
		

	}

}
