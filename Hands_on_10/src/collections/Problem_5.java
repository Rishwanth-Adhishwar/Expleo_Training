package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> tree=new TreeSet<>();
		boolean isRunning=true;
		
		while(isRunning)
		{
			System.out.print("Enter a number (or type 'done' to finish): ");
			String n=sc.nextLine();
			if(n.equals("done"))
			{
				isRunning=false;
			}
			else
			{
				tree.add(Integer.parseInt(n));
			}
		}
		
		System.out.println("Sorted unique numbers: "+tree);
		
		int sum=0;
		
		for(int v:tree)
		{
			sum+=v;
		}
		System.out.println("Average: "+(double)sum/tree.size());
		List<Integer> l = new ArrayList<>();
		for(int o:tree)
		{
			if(o%2!=0)
			{
				l.add(o);
			}
		}
		System.out.println("Odd Numbers: "+l);
		
		l.clear();
		
		for(int h:tree)
		{
			l.add(h);
		}
		System.out.println("Lowest: "+l.get(0));
		System.out.println("Highest: "+l.get(l.size()-1));
		
		
		

	}

}
