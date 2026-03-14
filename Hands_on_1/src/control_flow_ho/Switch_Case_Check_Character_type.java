package control_flow_ho;

import java.util.Scanner;

public class Switch_Case_Check_Character_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		
		
		switch(ch)
		{
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		case 'A':
			System.out.println("Vowel");
			break;
		case 'E':
			System.out.println("Vowel");
			break;
		case 'I':
			System.out.println("Vowel");
			break;
		case 'O':
			System.out.println("Vowel");
			break;
		case 'U':
			System.out.println("Vowel");
			break;
			
			
		default:
			if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
			{
				System.out.println("Consonant");
			}
			else
			{
				System.out.println("Symbol");
			}
			
		}

	}

}
