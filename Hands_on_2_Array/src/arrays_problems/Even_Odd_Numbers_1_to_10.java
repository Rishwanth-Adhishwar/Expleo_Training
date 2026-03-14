package arrays_problems;

public class Even_Odd_Numbers_1_to_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int even[]=new int[5];
		int odd[]=new int[5];
		
		int e=0,o=0;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				even[e]=i;
				e++;
			}
			else
			{
				odd[o]=i;
				o++;
			}
		}
		System.out.print("The even elements in 1-10: ");
		for(int i=0;i<even.length;i++)
		{
			System.out.print(even[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("The odd elements in 1-10: ");
		for(int i=0;i<even.length;i++)
		{
			System.out.print(odd[i]+" ");
		}

	}

}
