package arrays_problems;

import java.util.Scanner;

public class Merged_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int n1=sc.nextInt();
		
		int indian[]=new int[n1];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n1;i++)
		{
			indian[i]=sc.nextInt();
		}
		
		System.out.print("Enter the size: ");
		int n2=sc.nextInt();
		
		int NRI[]=new int[n2];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n2;i++)
		{
			NRI[i]=sc.nextInt();
		}
		
		System.out.print("Enter the size: ");
		int n3=sc.nextInt();
		
		int foreigners[]=new int[n3];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n3;i++)
		{
			foreigners[i]=sc.nextInt();
		}
		
		int merged[]=new int[n1+n2+n3];
		
		int k=0;
		for(int i=0;i<n1;i++)
		{
			merged[k]=indian[i];
			k++;
		}
		for(int i=0;i<n2;i++)
		{
			merged[k]=NRI[i];
			k++;
		}
		for(int i=0;i<n3;i++)
		{
			merged[k]=foreigners[i];
			k++;
		}
		
		for(int i=0;i<merged.length;i++)
		{
			for(int j=i+1;j<merged.length;j++)
			{
				if(merged[i]>merged[j])
				{
					int temp=merged[i];
					merged[i]=merged[j];
					merged[j]=temp;
				}
			}
		}
		System.out.print("Merged Sorted Array: ");
		
		for(int i=0;i<merged.length;i++)
		{
			System.out.print(merged[i]+" ");
		}
		

	}

}
