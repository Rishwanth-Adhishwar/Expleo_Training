package exceptionHandling;

import java.util.Scanner;

public class MyCalculator {
	
	
	public void power(int n1,int n2) throws Exception
	{
		if(n1==0 && n2==0)
		{
			throw new java.lang.Exception("java.lang.Exception: n1 and n2 should not be zero");
		}
		else if(n1<0 || n2<0)
		{
			throw new java.lang.Exception("java.lang.Exception: n1 or n2 should not be negative.");
		}
		else
		{
			System.out.println(Math.pow(n1, n2));
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number: ");
		int n1=sc.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int n2=sc.nextInt();
		
		MyCalculator mc = new MyCalculator();
		mc.power(n1,n2);
		

	}

}
