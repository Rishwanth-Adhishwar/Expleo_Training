package Control_Flow_Statements;

import java.util.Scanner;

public class If_Elseif_Else_Condition_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String seatType;
		System.out.print("Type of seats Available\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nChoose any Option: ");
	
		Scanner sc = new Scanner(System.in);
		seatType=sc.next();
		if(seatType.equals("REGULAR"))
		{
			System.out.println("You have selected REGULAR Seat and its Cost is RS.80");
		}
		else if(seatType.equals("PREMIUM"))
		{
			System.out.println("You have selected PREMIUM Seat and its Cost is RS.100");
		}
		else if(seatType.equals("EXECUTIVE"))
		{
			System.out.println("You have selected EXECUTIVE Seat and its Cost is RS.120");
		}
		else if(seatType.equals("VIP"))
		{
			System.out.println("You have selected VIP Seat and its Cost is RS.150");
		}
		else
		{
			System.out.println("You have not selected any Type");
		}
		
		sc.close();
	}

}
