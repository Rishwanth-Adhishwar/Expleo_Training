package problems;

import java.util.Scanner;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		
		int sumOfDigit=0;
		
		while(number!=0)
		{
			sumOfDigit+=number%10;
			number/=10;
		}
		
		System.out.print("The Sum of Digits is : "+sumOfDigit);
	}

}
