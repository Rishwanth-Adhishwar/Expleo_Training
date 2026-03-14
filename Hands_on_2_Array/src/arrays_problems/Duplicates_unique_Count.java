package arrays_problems;

import java.util.Scanner;
public class Duplicates_unique_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an Array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int duplicate=0,unique=0;
		
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
					a[j]=-1;
					c++;
				}
			}
			if(c>1)
			{
				duplicate++;
			}
			else
			{
				unique++;
			}
		}
		
		System.out.println("Duplicate: "+duplicate);
		System.out.println("Unique: "+unique);
		
		

	}

}
