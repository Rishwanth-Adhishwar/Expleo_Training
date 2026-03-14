package functions;

import java.util.Scanner;

public class PimeNumberBetween1_to_100 {
	
	public static void primePrint(int n)
	{
		for(int i=2;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		
		primePrint(n);

	}

}
