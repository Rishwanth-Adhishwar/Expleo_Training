package collections;

import java.util.HashMap;
import java.util.Map;

public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Write Java code to define yet another Set s. Insert 3 floating point numbers in s, and using an iterator, find the sum of the numbers in s.";
		
		text=text.toLowerCase();
		Map<Character,Integer> map=new HashMap<>();
		
		map.put('a', 0);
		map.put('c', 0);
		map.put('o', 0);
		map.put('s', 0);
		
		for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            }
        }
		
		System.out.println(map);

	}

}
