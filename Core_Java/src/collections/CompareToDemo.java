package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile> {
	private String name;
	private int ram;
	private double price;

	public Mobile(String name, int ram, double price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(Mobile o) {
		if (this.ram > o.getRam()) {
			return 1;

		} else {
			return -1;
		}
	}

}

public class CompareToDemo {

	public static void main(String[] args) {
		List<Mobile> m=new ArrayList<>(); 
		m.add(new Mobile("Redme",16,800));
		m.add(new Mobile("Vivo",8,800));
		m.add(new Mobile("Iqoo",4,600));
		
		Collections.sort(m);
		
		System.out.println("Mobile After Sorting: ");
		System.out.println("Name: "+"\t"+"Ram: "+"\t"+"Price");
		
		for(Mobile mb:m)
		{
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
			
		}

	}

}
