package problems;

import java.util.Scanner;
public class Hello_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		boolean isPositive=true;
		
		int c=0;
		while (isPositive)
		{
			System.out.print("Enter a Number: ");
			int n=sc.nextInt();
			if(n>=0)
			{
				System.out.println("Hello " +n);
				c++;
			}
			else
			{
				isPositive=false;
			}
		}
		System.out.println("Hello has been executed "+c+" times");

	}

}
