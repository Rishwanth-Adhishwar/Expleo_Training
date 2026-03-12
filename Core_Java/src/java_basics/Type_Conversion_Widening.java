package java_basics;

public class Type_Conversion_Widening {

	public static void main(String[] args) {
		int i=100; 
		long l =i;  //int to long conversion
		float f=l;  //long to float conversion
		System.out.println("Int value: "+i);
		System.out.println("Long Value: "+l);
		System.out.println("Float Value: "+f);

	}

}
