package control_flow_ho;

import java.util.Scanner;

public class Typing_Printing_Cost {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Pages to type: ");
        int pages = sc.nextInt();

        double typingCost = pages*3;

        System.out.print("Enter the Number of copies to Print: ");
        int copies = sc.nextInt();

        double printingCost;
        if(copies==1) 
        {
            printingCost=pages*1;
        } 
        else
        {
            printingCost=(pages*1)+((copies-1)*pages*3);
        }

        double bill=typingCost+printingCost;
        System.out.println("Typing Cost: " + typingCost);
        System.out.println("Printing Cost: " + printingCost);
        System.out.println("Total Bill: " +bill);

    }
}
