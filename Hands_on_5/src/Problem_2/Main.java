package Problem_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("--------Payment Options------- \n1.Credit card Payment\n2.UPI\n3.Net Banking\n4------------------------------\n");
		
		System.out.println("Choose Any One Payment Method(1-3): ");
		int n=sc.nextInt();
		String transactionId=String.valueOf(rand.nextInt(1,66666));
		
		if(n<=3&&n>=1)
		{
			if(n==1)
			{
				System.out.println("You Selected Credit Card Payment");
				System.out.print("Enter the Amount: ");
				double amount=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the Name: ");
				String customerName=sc.nextLine();
				System.out.print("Enter the credit card Number: ");
				String cardNumber=sc.nextLine();
				System.out.print("Enter CVV: ");
				String cvv=sc.nextLine();
				System.out.print("Enter your card Expiry Year: ");
				String expiryDate=sc.nextLine();
				
				CreditCardPayment cdp=new CreditCardPayment(transactionId,amount,customerName,cardNumber,cvv,expiryDate);
				cdp.executeTransaction();
			}
			else if(n==2)
			{
				
				System.out.println("You Selected UPI Payment Method");
				System.out.print("Enter the Amount: ");
				double amount=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the Name: ");
				String customerName=sc.nextLine();
				System.out.print("Enter Your UPI Id: ");
				String upiId=sc.nextLine();
				System.out.print("Enter Your UPI PIN: ");
				String upiPin=sc.nextLine();
				
				Upi upi = new Upi(transactionId,amount,customerName,upiId,upiPin);
				upi.executeTransaction();
				
			}
			else if(n==3)
			{
				System.out.println("You Selected Net Banking Payment");
				System.out.print("Enter the Amount: ");
				double amount=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the Name: ");
				String customerName=sc.nextLine();
				System.out.print("Enter Your BankName: ");
				String bankName=sc.nextLine();
				System.out.print("Enter Your Account Number: ");
				String accountNumber=sc.nextLine();
				System.out.print("Enter Your IFSC Code: ");
				String ifscCode=sc.nextLine();
				
				NetBankingPayment nbp=new NetBankingPayment(transactionId,amount,customerName,bankName,accountNumber,ifscCode);
				nbp.executeTransaction();
			}
			
				
		}
		else
		{
			System.out.println("Invalid Choice!...");
		}
		
		
		
		

	}

}
