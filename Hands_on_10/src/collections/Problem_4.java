package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No of Elements to add: ");
		int n=sc.nextInt();
		sc.nextLine();
		Map<String,Integer> hm=new HashMap<>(n);
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Name(Key): ");
			String name=sc.nextLine();
			System.out.println("Enter the marks(Value): ");
			int marks=sc.nextInt();
			hm.put(name, marks);
			sc.nextLine();
		}
		
		System.out.println("Elements in HashMap:");
		System.out.println(hm);
		
		Stack<String> stack = new Stack<>();
		for(Map.Entry<String, Integer> map:hm.entrySet())
		{
			if(map.getValue()>75)
			stack.push(map.getKey());
		}
		System.out.println("Students Marks Above 75 in stack: \n");
		
		System.out.print(stack);
		
		
		
		
		

	}

}
