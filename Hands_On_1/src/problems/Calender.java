package problems;

import java.util.Scanner;
public class Calender {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        while (true) {

	            System.out.print("Enter Month (1-12): ");
	            int month = sc.nextInt();

	            if (month < 1 || month > 12) {
	                break;
	            }

	            System.out.print("Enter Starting Day: ");
	            int startDay = sc.nextInt();

	            int days = 0;

	            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	                days = 31;
	            }
	            else if (month == 4 || month == 6 || month == 9 || month == 11) {
	                days = 30;
	            }
	            else if (month == 2) {
	                System.out.print("Enter Days in February: ");
	                days = sc.nextInt();
	            }

	            System.out.println("\nMon Tue Wed Thu Fri Sat Sun");

	            for (int i = 1; i < startDay; i++) {
	                System.out.print("    ");
	            }

	            int count = startDay - 1;  

	            for (int i = 1; i <= days; i++) {

	                System.out.printf("%-4d", i);
	                count++;   

	                if (count == 7) {
	                    System.out.println();
	                    count = 0;   
	                }
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}



