package generics1;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints=new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		
		double sum=sum(ints);
		System.out.println("Sum of these ints: "+sum);

	}
	
	public static double sum(List<? extends Number>list)
	{
		double sum=0;
		for (Number n:list)
		{
			sum+=n.doubleValue();
		}
		return sum;
	}
}
