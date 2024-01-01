package in.thiru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
       ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
       PaymentProcessing payprocess1 = context.getBean(PaymentProcessing.class);
      
       PaymentProcessing payprocess2 = context.getBean(PaymentProcessing.class);
       PaymentProcessing payprocess3 = context.getBean(PaymentProcessing.class);
       PaymentProcessing payprocess4 = context.getBean(PaymentProcessing.class);
       
       System.out.println(payprocess1.hashCode());
       System.out.println(payprocess2.hashCode());
       System.out.println(payprocess3.hashCode());
       System.out.println(payprocess4.hashCode());
       payprocess1.paymenetProcess(10.00);
       
      
       
       CreditCardPayment bean1 = context.getBean(CreditCardPayment.class);
       CreditCardPayment bean2 = context.getBean(CreditCardPayment.class);
       CreditCardPayment bean3 = context.getBean(CreditCardPayment.class);
       CreditCardPayment bean4 = context.getBean(CreditCardPayment.class);
       
       
       
       DebitCardPayment bean11 = context.getBean(DebitCardPayment.class);
       DebitCardPayment bean22 = context.getBean(DebitCardPayment.class);
       DebitCardPayment bean33 = context.getBean(DebitCardPayment.class);
       DebitCardPayment bean44 = context.getBean(DebitCardPayment.class);
       System.out.println("================CreditCardPayment[SCOPE=PROTOTYP]=========================");
       System.out.println(bean1.hashCode());
       System.out.println(bean2.hashCode());
       System.out.println(bean3.hashCode());
       System.out.println(bean4.hashCode());
       System.out.println("================CreditCardPayment[SCOPE=DEFAULT[SIGLETON]=========================");
       System.out.println(bean11.hashCode());
       System.out.println(bean22.hashCode());
       System.out.println(bean33.hashCode());
       System.out.println(bean44.hashCode());
	
	
	
	}

}
