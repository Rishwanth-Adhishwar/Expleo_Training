package Generics;

class Demo<T>
{
	private T t;
	public void set(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<Integer> iObj=new Demo<>();
		iObj.set(23);
		System.out.println(iObj.get());
		
		
		Demo<String> sObj=new Demo<>();
		sObj.set("Rishwa");
		System.out.println(sObj.get());

	}

}
