package Problem_2;


abstract class Payment {
	
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus ="Pending";
	
	public Payment(String transactionId, double amount, String customerName) 
	{
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
	}
	
	abstract boolean validatePayment();
	abstract boolean processPayment();
	
	void executeTransaction()
	{
		if (validatePayment()) 
		{
			 if (processPayment()) {
				 setPaymentStatus("Success");
			 }
			 else 
			 {
				 setPaymentStatus("Failed");
				 
			 }
		}
		else 
		{
		setPaymentStatus("Validation Failed");
		}
		generateReceipt();
	}
	
	void generateReceipt()
	{
		System.out.println("-----------Receipt-----------");
		System.out.println("Transactio Id: "+transactionId);
		System.out.println("Amount: "+amount);
		System.out.println("Customer Name: "+customerName);
		System.out.println("PaymentStatus: "+paymentStatus);
		System.out.println("-----------------------------");
	}

	public String getTransactionId() {
		return transactionId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String status) {
		paymentStatus = status;
	}

}

