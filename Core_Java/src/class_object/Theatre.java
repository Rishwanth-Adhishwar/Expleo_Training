package class_object;

public class Theatre {
	
	int theatreId = 143;
	String theatreName="DNC";
	String theatreLocation="Salem";
	
	public void displayTheatre()
	{
		System.out.println("Theatre ID: "+theatreId);
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Location: "+theatreLocation);
	}
	
	public static void main(String args[])
	{
		Theatre T1 = new Theatre();//Declare and instantiate
		
		Theatre T2;//Declare the reference
		
		T2 =new Theatre();//The instantiate
		
		T1.displayTheatre();//dot Operator
		
	}
	
}
