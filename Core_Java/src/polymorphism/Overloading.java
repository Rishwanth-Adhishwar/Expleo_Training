package polymorphism;

public class Overloading {
	static int add(int x,int y)
	{
		return x+y;
	}
	
	static double add(double x,double y)
	{
		return x+y;
	}
	 public static void main(String args[])
	 {
		 System.out.println(add(5,3));
		 System.out.println(add(1.5,1.5));
		 
	 }

}
