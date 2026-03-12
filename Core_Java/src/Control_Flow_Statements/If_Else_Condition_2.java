package Control_Flow_Statements;

import java.util.Scanner;

public class If_Else_Condition_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seatAvailable =false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Seat no: ");
		String seatNo=sc.next();
		if (seatAvailable)
		{
			System.out.println("You have booked the seat No: "+seatNo);
		}
		else
		{
			System.out.println("SeatNo:"+seatNo+" already Booked");
		}
		

	}

}
