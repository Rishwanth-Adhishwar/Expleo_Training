package keywordfinal;

public class Demo1 {
	final double pi=3.14159; //final variable
	
	public Demo1()
	{
		//pi=3.14; //cannot able to update
	}
	
	public static void main(String args[])
	{
		Demo1 d= new Demo1();
		System.out.println(d.pi); //compile time error (Cannot be assigned)
	}

}
