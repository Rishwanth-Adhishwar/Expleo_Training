package keywordfinal;

public class Demo {
	final double pi=3.14159; //final variable
	
	public Demo()
	{
//		pi=3.14; //cannot able to update
	}
	
	public static void main(String args[])
	{
		Demo d= new Demo();
		System.out.println(d.pi); //compile time error (Cannot be assigned)
	}

}
