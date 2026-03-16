package collections;

import java.util.ArrayList;

public class ArrayList_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<>();
		System.out.println("ArrayList Size: "+al.size());
		al.add("R");
		al.add("L");
		al.add("S");
		al.add("H");
		al.add("W");
		al.add("A");
		al.add(1, "I");
		System.out.println("ArrayList Size After Insert: "+al.size());
		System.out.print("Arraylist Elements: "+al);
		System.out.println();
		al.remove("A");
		al.remove(0);
		
		System.out.println("ArrayList After Removing element: "+al);
		System.out.println("ArrayList Size After Remove: "+al.size());
		
		
		

	}

}
