package problems;


import java.util.Scanner;

public class Discount_Calculate_Medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price: ");
		double price=sc.nextDouble();
		
		System.out.print("Enter the quantity: ");
		int quantity=sc.nextInt();
		
		double totalPrice=price*quantity;
		double discountPrice=0;
		double toPay=0;
		
		if(totalPrice>1000)
		{
			discountPrice=totalPrice*0.10;
		}
		else
		{
			discountPrice=totalPrice*0.05;
		}
		toPay=totalPrice-discountPrice;
		System.out.println("The Amount should be Paid after Discount is: "+toPay);
	}

}
