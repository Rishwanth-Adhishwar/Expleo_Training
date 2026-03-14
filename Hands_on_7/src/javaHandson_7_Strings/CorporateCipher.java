package javaHandson_7_Strings;

import java.util.Scanner;

public class CorporateCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Word to Cipher: ");
		String s = sc.nextLine();

		String result = "";



		for (int i = 0; i < s.length(); i++) {
			
			char a=s.charAt(i);
			if (a == ' ') 
			{
				a = '_';
			} 
			else if (a == 'x' || a == 'y' || a == 'z' || a== 'X' || a == 'Y' || a == 'Z') 
			{
				a = (char) (a- 23);
			} 
			else if(Character.isDigit(a))
			{
				
			}
			else 
			{
				a = (char) (a+ 3);
			}

			result = result + a;
		}

		System.out.print("Ciphered: "+result);

	}

}
