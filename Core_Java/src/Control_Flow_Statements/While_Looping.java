package Control_Flow_Statements;

public class While_Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSeatCount=10, seatCount=0;
		while(seatCount<maxSeatCount)
		{
			System.out.println("Current Seat Availability: "+(maxSeatCount-seatCount));
			seatCount++;
		}
		System.out.println("Seats are Filled");
	}

}
