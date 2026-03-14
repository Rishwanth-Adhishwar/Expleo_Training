package javaHandson_7_Strings;

import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		
		char a[]=s.toCharArray();
		
		boolean c[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(c[i]==true) 
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c[j]=true;
				}
			}
			
		}
		System.out.print("Duplicates Removed String: ");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==false)
			{
				System.out.print(a[i]);
			}
		}

	}

}
