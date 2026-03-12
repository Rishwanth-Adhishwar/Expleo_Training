package array;

import java.util.Scanner;

public class Jagged_Array{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int vipTotal=3,premiumTotal=10,regularTotal=4,vCount=0,pCount=0,rCount=0;
		System.out.print("Enter the Row1 size: ");
		int r1=sc.nextInt();
		System.out.print("Enter the col1 size: ");
		int c1=sc.nextInt();
		System.out.print("Enter the col2 size: ");
		int c2=sc.nextInt();
		System.out.print("Enter the col3 size: ");
		int c3=sc.nextInt();
		
		System.out.println("Enter Array 1 Elements: ");
		
		String a[][]=new String[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.next();
				if(a[i][j].equals("B"))
				{
					vCount++;
				}
			}
		}
		
		System.out.println("Enter Array 2 Elements: ");
		String b[][]=new String[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.next();
				if(b[i][j].equals("B"))
				{
					pCount++;
				}
			}
		}

		System.out.println("Enter Array 3 Elements: ");
		String c[][]=new String[r1][c3];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c3;j++)
			{
				c[i][j]=sc.next();
				if(c[i][j].equals("B"))
				{
					rCount++;
				}
			}
		}
		
		System.out.println("***********MOVIE SEAT ARRANGEMENT************");
		System.out.println("******VIP SEATS*******");

		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("******PREMIUM SEATS********");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("******REGULAR SEATS******");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*****SEAT BOOKED DETAIL*****");
		System.out.println("*****VIP SEATS*****");
		System.out.println("BOOKED: "+vCount+" AVAILABLE: "+(vipTotal-vCount)+" TOTAL: "+c1);
		System.out.println("*****PREMIUM SEATS*****");
		System.out.println("BOOKED: "+pCount+" AVAILABLE: "+(premiumTotal-pCount)+" TOTAL: "+c2);
		System.out.println("*****REGULAR SEATS*****");
		System.out.println("BOOKED: "+rCount+" AVAILABLE: "+(regularTotal-rCount)+" TOTAL: "+c3);

	}

}
