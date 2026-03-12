package function;

import java.util.Scanner;

public class Movie_Details_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name: ");
		String name=sc.nextLine();
		
		System.out.println("Eneter Movie Description: ");
		String description=sc.nextLine();
		
		System.out.println("Enter Movie Duration: ");
		String duration=sc.nextLine();
		
		System.out.println("Enter Movie Language: ");
		String language=sc.nextLine();
		
		System.out.println("Enter Movie Release Date: ");
		String releaseDate=sc.nextLine();
		
		System.out.println("Enter the Movie Country: ");
		String country=sc.nextLine();
		
		System.out.println("Enter the Movie Genre: ");
		String genre=sc.nextLine();
		
		getMovieDetails(name,description,duration,language,releaseDate,country,genre);

	}
	
	public static void getMovieDetails(String name,String description,String duration,String language,String releaseDate,String country,String genre)
	{
		System.out.println("********MOVIE DETAILS********");
		System.out.println("Movie Name: "+name);
		System.out.println("Description: "+description);
		System.out.println("Duration: "+duration);
		System.out.println("Language: "+language);
		System.out.println("Release Date: "+releaseDate);
		System.out.println("Country: "+country);
		System.out.println("Genre: "+genre);
		System.out.println("*****************************");
	}

}
