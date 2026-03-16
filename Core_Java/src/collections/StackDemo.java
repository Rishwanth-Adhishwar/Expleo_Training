package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stk= new Stack<>();
		
		System.out.println("Size of the Stack: "+stk.size());
		
		stk.push("Rishwa");
		stk.push("Sandy");
		stk.push("Vasu");
		stk.push("Kabilan");
		
		System.out.println("Elements in Stack: "+stk);
		System.out.println("Size of Stack after adding elements: "+stk.size());
		
		System.out.println("Peak Element stack: "+stk.peek());
		stk.pop();
		System.out.println("Elements of stack after Remove: "+stk);
		System.out.println("Size of Stack after removing Elements:"+stk.size());

	}

}
