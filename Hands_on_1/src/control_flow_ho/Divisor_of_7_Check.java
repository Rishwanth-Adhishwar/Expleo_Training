package control_flow_ho;

import java.util.Scanner;

public class Divisor_of_7_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		
		if(number%7==0)
		{
			System.out.println("The Number "+number+" is Divisor of 7");
		}

	}

}
