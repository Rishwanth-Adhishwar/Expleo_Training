package array;

public class Array_With_For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {90,88,77,54,67};
		
		String[] name= {"Rishwa","Sriram","Jeeva","Krishna","Tamil"};
		
		System.out.print("Marks Using For Each: ");
		
		for(int a:marks)
		{
			System.out.print(a+" ");
		}
		System.out.print("\nNames Using For Each: ");
		for(String b:name)
		{
			System.out.print(b+" ");
		}

	}

}
