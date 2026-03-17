package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many words do you want to input:");
		int n=sc.nextInt();
		sc.nextLine();
		Set<String> set = new LinkedHashSet<>(n);
		
		String concat="";
		for(int i=1;i<=n;i++)
		{
			
			System.out.print("Enter Element in the Set: ");
			String s=sc.nextLine();
			set.add(s);
			
			
		}
		
		for(String var:set)
		{
			concat+=var+" ";
		}
		
		System.out.println("Concatenated Result: "+concat);
		
		
		
		
		

	}

}
