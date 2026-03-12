package Control_Flow_Statements;

import java.util.Scanner;

public class If_condition_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		boolean seatAvailable=true;
		
		System.out.print("Enter the Seat Number: ");
		String seatNo=sc.nextLine();
		
		if (seatAvailable)
		{
			System.out.println("You have been booked the Seat Number: "+seatNo);
		}
	}

}
