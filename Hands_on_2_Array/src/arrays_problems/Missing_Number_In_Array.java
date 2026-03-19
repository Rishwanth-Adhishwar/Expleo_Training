package arrays_problems;


public class Missing_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		int sum=0;
		int n=a.length+1;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println();
		int real=(n*(n+1))/2;
		
		System.out.print("The Missing Number is: "+(real-sum));

	}

}
