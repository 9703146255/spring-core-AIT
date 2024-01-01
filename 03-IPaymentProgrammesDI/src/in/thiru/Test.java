package in.thiru;

public class Test {
	
	public static void main(String[] args) 
	{
		
		

//		//constructor injection
//		PaymentProcessing pp1=new PaymentProcessing(new CreditCardPayment());
//		pp1.processingPayment(100.0);
//	
//		PaymentProcessing pp2=new PaymentProcessing(new CreditCardPayment());
//		pp2.processingPayment(200.0);
//		
////		//setter injection
//		CreditCardPayment  credit=new CreditCardPayment();
//		DebitCardPayment  debit=new DebitCardPayment();
////	
//		PaymentProcessing p1=new PaymentProcessing(credit);
//		PaymentProcessing p2=new PaymentProcessing(debit);
//		p1.processingPayment(400.00);
//		p2.processingPayment(400.6);
//		
//		
//		
		//constructor injection
		PaymentProcessing pp1=new PaymentProcessing(new CreditCardPayment());
		
		
		
		//setter injection
		pp1.setPaymentProcessing(new DebitCardPayment());
		System.out.println("SETTER INJECTION WILL OVERRIDE THE CONSTRUCTOR INJECTION");
		pp1.processingPayment(100.0);
//		
//		/*
//		 IF WE USE CI AND SI THEN SI WILL BE OVERRIDES THE CONSTRUCTOR INJECTION...
//		 */
		
		
		
		
		
		
		
	}

}
