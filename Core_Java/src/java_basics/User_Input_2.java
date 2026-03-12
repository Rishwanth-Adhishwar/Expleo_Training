package java_basics;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class User_Input_2 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);//Object created for Scanner class for user input
		
		System.out.println("WELCOME TO MOVIE BOOKING SYSTEM");
		System.out.println();
		System.out.print("Enter Movie Id: ");
		int id=sc.nextInt();//Movie id is got as input
		sc.nextLine();
		
		System.out.print("Enter Movie name: ");
		String name=sc.nextLine();//Movie name is got as input
		
		System.out.print("Enter Movie Description: ");
		String des=sc.nextLine();//Movie Description is got as input
		
		System.out.print("Enter Movie language: ");
		String lang=sc.next();//Movie language is got as input
		
		System.out.print("Enter Movie Genre: ");
		String genre=sc.next();//Movie Genre is got as input
		
		System.out.print("Enter Movie Release Date: ");
		String date=sc.next();	//Movie Date is got as input
		SimpleDateFormat moviereleasedate=new SimpleDateFormat("dd/MM/yyyy");// object created for SimpleDateFormat class
		Date moviedate=moviereleasedate.parse(date);
		
		System.out.print("Enter Movie Seat Cost:  ");
		float cost=sc.nextFloat();//Movie seat cost is got as input
		
		System.out.println();
		
		System.out.println("ENTER MOVIE DETAILS");
		System.out.println("Movie Id: "+id);
		System.out.println("Movie Name: "+name);
		System.out.println("Movie Description: "+des);
		System.out.println("Movie Language: "+lang);
		System.out.println("Movie Genre: "+genre);
		System.out.println("Movie Relaease Date: "+date);
		System.out.println("Movie Seat Cost: "+cost);
		
	}

}
