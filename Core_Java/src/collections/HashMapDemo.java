package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Double> hm = new HashMap<String, Double>();
		System.out.println("Size of HashMap: " + hm.size());

		hm.put("sersi Lanister", 4343.43);
		hm.put("John Snow", 145.23);
		hm.put("Jame Lanister", 1450.78);
		hm.put("Aarya Stark", -18.76);
		System.out.println("Elements in HashMap: " + hm);
		System.out.println();
		System.out.println("Size Of HashMap after adding Input: " + hm.size());

		Set<Map.Entry<String, Double>> set = hm.entrySet();
//		System.out.println(set);
		System.out.println();
		for(Map.Entry<String,Double> me:set)
		{
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
	}

}
