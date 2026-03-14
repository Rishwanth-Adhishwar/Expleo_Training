package control_flow_ho;

import java.util.Arrays;
import java.util.Scanner;

public class Ascii_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		
		char a[]=s.toCharArray();
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ') 
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
