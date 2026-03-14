package Problem_2;


class NetBankingPayment extends Payment {
	
	String bankName;
	String accountNumber;
	String ifscCode;
	
	NetBankingPayment(String transactionId,double payment,String customerName,String bankName,String accountNumber,String ifscCode)
	{
		super(transactionId,payment,customerName);
		this.bankName=bankName;
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
	}
	
	boolean validatePayment()
	{
		if(accountNumber.length()==12 && ifscCode.length()==11)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean processPayment()
	{
		System.out.println("Processing Net Banking Payment......");
		return true;
	}

}
