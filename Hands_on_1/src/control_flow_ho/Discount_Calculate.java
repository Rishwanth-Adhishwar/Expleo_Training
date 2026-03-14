package control_flow_ho;

import java.util.Scanner;

public class Discount_Calculate {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price per item : ");
		double price=sc.nextDouble();
		
		System.out.print("Enter the Quantity of item : ");
		int quantity =sc.nextInt();
		
		double totalPrice=price*quantity;
		double discount=0;
		
		if(quantity>500)
		{
			discount=totalPrice*15/100;
		}
		
		double discountPrice=totalPrice-discount;
		
		System.out.println("The Discount Price is: "+discountPrice);
		
		

	}

}
