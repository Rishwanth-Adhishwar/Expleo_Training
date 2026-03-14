package Problem_2;

class CreditCardPayment extends Payment {
	
	String cardNumber;
	String cvv;
	String expiryDate;
	
	CreditCardPayment(String transactionId, double amount, String customerName,String cardNumber,String cvv,String expiryDate)
	{
		super(transactionId,amount,customerName);
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
	}
	
	boolean validatePayment()
	{
		if(cvv.length()==3 && cardNumber.length()==16 && Integer.parseInt(expiryDate)>2026) 
		{
			return true;
		}
		return false;
	}
	
	boolean processPayment()
	{
		System.out.println("Processing credit card Payment...");
		return true;
	}
	
	

}
