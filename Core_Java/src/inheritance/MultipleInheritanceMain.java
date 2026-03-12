package inheritance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

interface SearchbyGenre 
{
	public abstract void searchByGenre(String genre);
}

interface SearchbyTitle 
{
	public abstract void searchByTitle(String title);
}

class Catlog implements SearchbyTitle, SearchbyGenre 
{
	private static Date lastUpdated;
	static List<Movie> MovieList = new ArrayList<Movie>();

	public void searchByTitle(String title) 
	{
		for (Movie movie : MovieList) {
			if (movie.getTitle().equals(title)) 
			{
				System.out.println(movie.getMovieDetail());
			}
		}
	}

	public void searchByGenre(String genre) 
	{
		for (Movie movie : MovieList) 
		{
			if (movie.getGenre().equals(genre)) 
			{
				System.out.println(movie.getMovieDetail());
			}
		}
	}
}

class Movie
{
	private String title;
	private String genre;
	private Date movieDate;
	private String lang;
	private String place;
	private int rating;
	
	public Movie(String title, String genre, Date movieDate, String lang, String place, int rating) 
	{
		this.title = title;
		this.genre = genre;
		this.movieDate = movieDate;
		this.lang = lang;
		this.place = place;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public Date getMovieDate() {
		return movieDate;
	}

	public String getLang() {
		return lang;
	}

	public String getPlace() {
		return place;
	}

	public int getDuration() {
		return rating;
	}

	public String getMovieDetail() {
		
		
		return "| " + title + " |" + genre + " |" + movieDate + " |  " + lang + " |"
				+ place + " | " + rating + " |";
	}
	
}

public class MultipleInheritanceMain {

	public static void main(String[] args) {
		
		Catlog c=new Catlog();
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		Date date = cal.getTime();
		
		String todaysdate = dateFormat.format(date);
		
		Movie M1 = new Movie("AAA","Adv",date,"Eng","France",3); 
		c.MovieList.add(M1);
		
		Movie M2 = new Movie("BBB","Act",date,"Tam","Egypt",2); 
		c.MovieList.add(M2);
		
		Movie M3 = new Movie("ccc","Trl",date,"Hin","India",3); 
		c.MovieList.add(M3);
		
		System.out.println("-----------------------Search By Genre-------------------------");
		c.searchByGenre("Adv");
		c.searchByGenre("Thrl");
		System.out.println("-----------------------Search By Genre-------------------------");
		c.searchByTitle("ccc");
		c.searchByTitle("BBB");
		
		

	}

}
