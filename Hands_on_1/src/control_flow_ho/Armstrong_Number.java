package control_flow_ho;


import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int number=sc.nextInt();
		
		int copy=number,c=0,sum=0;
		
		while(number!=0)
		{
			number/=10;
			c++;
		}
		number=copy;
		while(copy!=0)
		{
			sum+=Math.pow(copy%10,c);
			copy/=10;
		}
		if(sum==number)
		{
			System.out.println("The Number is Armstrong Number");
		}
		else
		{
			System.out.println("The Number is Not a Armstrong Number");
		}
		
		

	}

}
