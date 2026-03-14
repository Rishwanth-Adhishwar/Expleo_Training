package javaHandson_7_Strings;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Email: ");
		String s = sc.nextLine();
		char[] a = s.toCharArray();

		boolean isValid = true;

		if (s.contains("@")) {

			if (!((a[0] >= 'a' && a[0] <= 'z') || (a[0] >= 'A' && a[0] <= 'Z'))) {
				isValid = false;
			}

			for (int i = 0; i < s.length() - 1; i++) 
			{

				if ((a[i] == '.' && a[i + 1] == '.') || (a[i] == '_' && a[i + 1] == '_')
						|| (a[i] == '-' && a[i + 1] == '-') || (a[i] == '-' && a[i + 1] == '_')
						|| (a[i] == '_' && a[i + 1] == '.') || (a[i] == '.' && a[i + 1] == '_')
						|| (a[i] == '-' && a[i + 1] == '.') || (a[i] == '@' && a[i + 1] == '_')
						|| (a[i] == '@' && a[i + 1] == '-') || (a[i] == '@' && a[i + 1] == '.')
						|| (a[i] == '-' && a[i + 1] == '@') || (a[i] == '.' && a[i + 1] == '@')
						|| (a[i] == '_' && a[i + 1] == '@')) {
					isValid = false;
					break;
				}

				if (!((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z') || (a[i] >= '0' && a[i] <= '9')
						|| a[i] == '_' || a[i] == '-' || a[i] == '.' || a[i] == '@')) 
				{
					isValid = false;
					break;
				}
			}

			char c = a[a.length - 1];
			if (c == '.' || c == '_' || c == '-' || c == '@')
			{
				isValid = false;
			}

		}
		else 
		{
			isValid = false;
		}

		if (isValid) 
		{
			System.out.println("Valid email");
		} 
		else 
		{
			System.out.println("Invalid email");
		}

	}
}