package Control_Flow_Statements;

public class For_Looping_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSeatCount=5,seatCount=0;
		
		for(seatCount=0;seatCount<maxSeatCount;seatCount++)
		{
			System.out.println("Current Seats Available: "+(maxSeatCount-seatCount));
		}
		System.out.println("Seats are filled");

	}

}
