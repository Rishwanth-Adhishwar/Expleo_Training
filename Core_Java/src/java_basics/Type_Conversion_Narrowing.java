package java_basics;

public class Type_Conversion_Narrowing {

	public static void main(String[] args) {
		double d=100.04;
		long l=(long)d;
		int i=(int)l;
		
		System.out.println("Double Value: "+d);
		System.out.println("Long Value: "+l);
		System.out.println("Int Value: "+i);
	}

}
