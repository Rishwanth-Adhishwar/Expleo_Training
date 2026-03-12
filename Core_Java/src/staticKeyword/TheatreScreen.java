package staticKeyword;

public class TheatreScreen {
	
	private static int totseat = 20;
	
	TheatreScreen(){
		System.out.println("Current seat availability : "+totseat);
	}
	
	public void DisplayTheatreScreen() {
		System.out.println("Current seat available : "+totseat);
	}
	
	public static void BookTicket(int nooftick) {
		System.out.println("No. of seats booked : "+nooftick);
	}
	
	public static void main(String args[])
	{
		System.out.println("Screen Ticket Available Status: ");
		
		TheatreScreen TS1=new TheatreScreen();
		TS1.BookTicket(4);
		
		TheatreScreen TS2=new TheatreScreen();
		TS1.BookTicket(5);
		
		TS2.DisplayTheatreScreen();
		
	}
	
}
