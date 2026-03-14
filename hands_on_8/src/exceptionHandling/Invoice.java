package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Invoice {
	
	int partNo;
	String partDescription;
	int quantity;
	double pricePerItem;
	
	

	public Invoice(int partNo, String partDescription, int quantity, double pricePerItem) throws Exception {
		
		 if (partNo <= 0) {
	            throw new Exception("Part number must be greater than 0");
	        }

	        if (partDescription == null || partDescription.trim().isEmpty()) {
	            throw new Exception("Part description cannot be empty");
	        }

	        if (quantity <= 0) {
	            throw new Exception("Quantity must be greater than 0");
	        }

	        if (pricePerItem <= 0) {
	            throw new Exception("Price per item must be greater than 0");
	        }
		this.partNo = partNo;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public double getTotalAmount()
	{
		return quantity*pricePerItem;
	}
	
    public void display() {
        System.out.println("Part Number: " + partNo);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + pricePerItem);
        System.out.println("Total Amount: " + getTotalAmount());
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter Part Number: ");
            int partNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Part Description: ");
            String description = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter Price Per Item: ");
            double price = sc.nextDouble();
            
            Invoice i = new Invoice(partNumber,description,quantity,price);
            i.display();
		}
		catch(InputMismatchException x)
		{
			System.out.println("InputMismatchException: "+x);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
