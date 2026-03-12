package innerclass1;

class Outer{
	int value=56;
	
	public void outerClassMethod()
	{
		System.out.println("Inside outer class Method");
		class Inner
		{
			public void innerClassMethod()
			{
				System.out.println("insisde the inner class Method");
				System.out.println("Value: "+value);
			}
		}
		Inner in=new Inner();
		in.innerClassMethod();
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer = new Outer();
		outer.outerClassMethod();

	}

}
