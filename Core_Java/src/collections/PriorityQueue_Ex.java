package collections;

import java.util.PriorityQueue;

public class PriorityQueue_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("a");
		pq.add("z");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		pq.add("f");
		
		System.out.println("Elements in the priority Queue: ");
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll());
		}
		

		
		

	}

}
