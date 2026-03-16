package collections;

import java.util.Vector;

public class Vector_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <String> v = new Vector<>(2,3);
		
		System.out.println("Capacity of vector default: "+v.capacity());
		System.out.println("Size of Vector Befor Adding elements: "+v.size());
		v.add("Rishwa");
		v.add("Sriram");
		v.add("Jeeva");
		v.add("Muhindher");
		v.add("TamilKumar");
		System.out.println("Elements in Vector: "+v);
		System.out.println("Size of vector after adding elements: "+v.size());
		System.out.println("Capacity after adding Elements: "+v.capacity());
	}

}
