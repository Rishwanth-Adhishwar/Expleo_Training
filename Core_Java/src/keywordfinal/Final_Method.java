package keywordfinal;

class Base
{
	public /*final*/ void display(String s) //final method 
	{
		System.out.println(s);
	}
}


class Sample extends Base
{
	public void display(String s)//final method cannot be override
	{
		System.out.println(s);
	}
}


public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s =new Sample();//object for child class
		s.display("Rishwa");

	}

}
