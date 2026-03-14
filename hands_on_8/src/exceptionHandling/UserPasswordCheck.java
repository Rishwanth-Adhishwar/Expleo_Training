package exceptionHandling;

import java.util.Scanner;
public class UserPasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		String registeredname="Admin143";
		String registeredpass="discodance";
		
		try
		{
			System.out.print("Enter the UserName: ");
			String username=sc.nextLine();
			System.out.print("Enter the Password: ");
			String password=sc.nextLine();
			
			if(username.length()<6 || username.length()>30)
			{
				throw new Exception("Invalid username Length");
			}
			
			if(!Character.isLetter(username.charAt(0)))
			{
				throw new Exception("UserName should start with Alphabetic");
			}
			
			if(password.length()<8)
			{
				throw new Exception("Password length should be atleast 8");
			}
			
			if(username.equals(registeredname) && password.equals(registeredpass))
			{
				System.out.println("Welcome "+username);
			}
			else
			{
				System.out.println("Invalid UserName (or) PassWord");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
