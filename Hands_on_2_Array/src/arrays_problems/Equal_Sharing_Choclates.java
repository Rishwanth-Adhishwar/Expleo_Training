package arrays_problems;

import java.util.Scanner;

public class Equal_Sharing_Choclates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the No.of friends in Groups: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		int sum=0;
		System.out.print("Enter No.of Choclates Each had: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		if(sum%n==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
