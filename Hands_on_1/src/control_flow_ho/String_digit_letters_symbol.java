package control_flow_ho;

import java.util.Scanner;

public class String_digit_letters_symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String sentence=sc.nextLine().toLowerCase();
		
		int letters=0;
		int digits=0;
		int Symbols=0;
		char a[]=sentence.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' &&a[i]<='z')
			{
				letters++;
			}
			else if(a[i]>='0' && a[i]<='9')
			{
				digits++;
			}
			else
			{
				Symbols++;
			}
		}
		
		System.out.println("The letters in Sentence is: "+letters);
		System.out.println("The Digits in Sentence is: "+digits);
		System.out.println("The Symbols in Sentence is: "+Symbols);
	}

}
