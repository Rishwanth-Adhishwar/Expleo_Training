package control_flow_ho;

import java.util.Scanner;

public class Second_In_Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Weeks: ");
		int week=sc.nextInt();
		
		int oneWeek=86400*7;
		
		System.out.println("The Seconds For "+week+" Week is: "+oneWeek*week);

	}

}
