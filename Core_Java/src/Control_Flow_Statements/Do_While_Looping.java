package Control_Flow_Statements;

public class Do_While_Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSeatCount=5,seatCount=0;
		
		do
		{
			System.out.println("Current seat Availability: "+(maxSeatCount-seatCount));
			seatCount++;
		}while(seatCount<maxSeatCount);
		
		System.out.println("seats are Filled");
	}

}
