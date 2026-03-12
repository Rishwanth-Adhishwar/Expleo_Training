package array;

public class Single_Dimension_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]=new int[3];
		marks[0]=90;
		marks[1]=88;
		
		//marks[4]=50; java.lang.ArrayIndexOutOfBoundsException
		System.out.println("Element at index 0: "+marks[0]);
		System.out.println("Element at index 1: "+marks[1]);
		System.out.println("Element at index 2: "+marks[2]);
		//System.out.println(marks[3]);// java.lang.ArrayIndexOutOfBoundsException
		System.out.println("Array length: "+marks.length);

	}

}
