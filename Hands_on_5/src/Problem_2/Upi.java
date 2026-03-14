package Problem_2;

class Upi extends Payment {
	
	String upiId;
	String upiPin;
	
	Upi(String transactionId, double amount, String customerName,String upiId,String upiPin)
	{
		super(transactionId, amount, customerName);
		this.upiId=upiId;
		this.upiPin=upiPin;
	}
	
	boolean validatePayment()
	{
		if(upiId.contains("@") && upiPin.length()==4)
		{
			return true;
		}
		return false;
		
	}
	
	boolean processPayment()
	{
		System.out.println("Processing UPI Payment........");
		return true;
	}

}
