package problems;


import java.util.Scanner;

public class Cloth_Showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total cost: ");
		double totalCost=sc.nextDouble();
		double discount=0;
		double toPay=0;
		
		if(totalCost<2000)
		{
			discount=totalCost*0.05;
		}
		else if(totalCost>=2000 && totalCost<5000)
		{
			discount=totalCost*0.25;
		}
		else if(totalCost>=5000 && totalCost<10000)
		{
			discount=totalCost*0.35;
		}
		else
		{
			discount=totalCost*0.50;
		}
		
		toPay=totalCost-discount;
		
		System.out.println("The Amount to be paid is: "+toPay);

	}

}
