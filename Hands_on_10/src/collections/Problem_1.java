package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many names do you want to input:");
		int n=sc.nextInt();
		sc.nextLine();
		List<String> l=new ArrayList<>(n);
		
		for(int i=1;i<=n;i++)
		{
			
			System.out.print("Enter name #"+i+": " );
			String s=sc.nextLine();
			l.add(s);
			
		}
		System.out.println("Names longer than 5 characters: ");
		for(String s:l)
		{
			if(s.length()>5)
			{
				System.out.println(s);
			}
		}
		

	}

}
