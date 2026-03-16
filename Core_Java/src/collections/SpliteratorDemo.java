package collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Double> doubleValues = new ArrayList<Double>();
		doubleValues.add(1.0);
		doubleValues.add(2.0);
		doubleValues.add(3.0);
		doubleValues.add(4.0);
		doubleValues.add(5.0);
		doubleValues.add(6.0);
		
		System.out.println("Contents of ArrayList using try Advance");
		Spliterator<Double> sitr = doubleValues.spliterator();
		while(sitr.tryAdvance((n)->System.out.print(n+" ")));
		System.out.println();
		System.out.println("Contents of ArrayList using try forEachRemaining");
		sitr=doubleValues.spliterator();
		sitr.forEachRemaining((n)->System.out.print(n+" "));
		System.out.println();
		System.out.println("Size of Array List After Insertion: "+doubleValues.size());
		
		

	}

}
