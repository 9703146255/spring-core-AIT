package in.thiru;

public class PaymentProcessing 
{
	private IPayment payment;
	
	
	//initializing by using constructor
	public PaymentProcessing(IPayment payment)
	{
		this.payment=payment;
		System.out.println("PaymentProcessing :: Constructor");
	}
	
	//initializing by using setter
	public void setPaymentProcessing(IPayment payment)
	{
		this.payment=payment;
	}
	
	
	
	public void processingPayment(Double amount) 
	{
		boolean status = payment.pay(amount);
		
		if(status)
		{
			System.out.println("payment is success");
		}
		else
		{
			System.out.println("payment is failure");
		}
	}

}
