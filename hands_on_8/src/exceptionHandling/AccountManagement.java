package exceptionHandling;

import java.util.*;

class PayOutOfBoundException
{
	
	public void checkForDebit(double amount,double balance) throws Exception
	{
		try
		{
			if(amount>30000)
			{
				throw new Exception("Transaction Limit Exceeded");
			}
			else
			{
				System.out.println("Transaction is Successful");
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	public void withdrawAmount(double amount,double balance)
	{
		try
		{
			if(amount>balance)
			{
				throw new Exception("The Amount is Insufficient");
			}
			else
			{
				balance-=amount;
				System.out.println("Amount Withdrawed Successfully");
				System.out.println("Current Balance: "+balance);
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
}

public class AccountManagement {
	
	public static void main(String args[]) throws Exception
	{
		double balance=80000;
		Scanner sc = new Scanner(System.in);
		System.out.println("***********Welcome to ATM**********\n1.Debit.\n2.Withdraw\n**********************************");
		System.out.print("Enter your Choice: ");
		int choice=sc.nextInt();
		PayOutOfBoundException pobe=new PayOutOfBoundException();
		
		try
		{
			if(choice==1 || choice==2)
			{
				if(choice==1)
				{
					System.out.print("Enter the transaction Amount: ");
					double transactionAmount=sc.nextDouble();
					pobe.checkForDebit(transactionAmount,balance);
				}
				else if(choice==2)
				{
					System.out.print("Enter the Amount to Withdraw: ");
					double withdrawAmount=sc.nextDouble();
					pobe.withdrawAmount(withdrawAmount, balance);
				}
			}
			else
			{
				throw new Exception("Invalid Choice");
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}

		
		
	}

}
