package collections;

import java.util.ArrayList;

public class ArrayList_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		
		System.out.println("Initial Size of ArrayList: "+al.size());
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println("Size of ArrayList after adding Elements: "+al.size());
		System.out.println("The Elements in ArrayList: "+al);
		
		Integer ia[]=new Integer[al.size()];
		
		ia=al.toArray(ia);
		
		int sum=0;
		
		for(int i:ia)
		{
			sum+=i;
		}
		
		System.out.println("Sum: "+sum);
		
		

	}

}
