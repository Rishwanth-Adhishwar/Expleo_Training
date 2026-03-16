package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Double> hm = new TreeMap<String, Double>();
		System.out.println("Size of TreeMap: " + hm.size());

		hm.put("sersi Lanister", 4343.43);
		hm.put("John Snow", 145.23);
		hm.put("Jame Lanister", 1450.78);
		hm.put("Aarya Stark", -18.76);
		System.out.println("Elements in TreehMap: " + hm);
		System.out.println();
		System.out.println("Size Of TreeMap after adding Input: " + hm.size());

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


