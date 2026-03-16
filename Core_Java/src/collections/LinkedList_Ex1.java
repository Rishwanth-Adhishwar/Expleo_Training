package collections;

import java.util.LinkedList;

public class LinkedList_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<>();
		
		System.out.println("Size of linkedlist Before Elements Adding: "+ll.size());
		
		ll.add("Java");
		ll.add("Python");
		ll.add("C");
		ll.add("C++");
		ll.add("Dart");
		
		System.out.println("Size of linkedlist After Elements Adding: "+ll.size());
		System.out.println("Elements: "+ll);
		
		ll.addFirst("Js");
		ll.addLast("React.Js");
		System.out.println("Elements after adding in 1st and last: "+ll);
		
		ll.remove(4);
		ll.remove("Java");
		System.out.println("Elements After Removing: "+ll);
		
		System.out.println("Size of linkedlist: "+ll.size());
		
		LinkedList<String> clone=new LinkedList<>();
		
	   clone=(LinkedList<String>) ll.clone();
	   System.out.println(clone);
		

	}

}
