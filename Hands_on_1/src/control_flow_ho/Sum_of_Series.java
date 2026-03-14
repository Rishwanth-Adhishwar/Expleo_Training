package control_flow_ho;

import java.util.Scanner;

public class Sum_of_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		
		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;

		}while(i<=n);
		System.out.println("Sum of Series of 1st "+n+" number is :"+sum);
		}

}
