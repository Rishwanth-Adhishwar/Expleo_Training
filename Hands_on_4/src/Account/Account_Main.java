package Account;

public class Account_Main {
	public static void main(String args[])
	{
		
		//user creation with and without balance
		Account u1 = new Account("1A2BB3C4","Hari");
		Account u2 = new Account("1BC3G7R8","Raju",1000);
		
		//credit
		u1.credit(1000);
		u2.credit(2000);
		
		//debit
		u1.debit(100);
		u2.debit(100);
		
		//transfer
		u1.transfer(u2, 100);
		
		//display
		System.out.println(u1.toString());
		System.out.println();
		System.out.println(u2.toString());
		
		
	}
		

}
