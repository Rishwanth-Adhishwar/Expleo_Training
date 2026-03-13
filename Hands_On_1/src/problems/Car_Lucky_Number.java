package problems;

import java.util.Scanner;
public class Car_Lucky_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		
		int sumOfDigit=0,c=0;
		
		while(number!=0)
		{
			sumOfDigit+=number%10;
			c++;
			number/=10;
			
		}
		
		if(c==4)
		{

			if(sumOfDigit%3==0 ||sumOfDigit%5==0||sumOfDigit%7==0)
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry It's Not a Lucky Number");
			}

		}
		else
		{
			System.out.println("It is not a valid Car number");
		}
		
	}

}
