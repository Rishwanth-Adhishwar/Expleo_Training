package problems;


import java.util.Scanner;

public class Digit_Alpha_Symbol_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("It is Alphabetic");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("It is a digit");
		}
		else
		{
			System.out.println("Symbol");
		}

	}

}
