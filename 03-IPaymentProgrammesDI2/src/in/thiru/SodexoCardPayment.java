package in.thiru;

public class SodexoCardPayment implements IPayment {

	@Override
	public boolean pay(Double amount) {

		System.out.println("SodexoCardPayment payment processing..");

		return true;
	}

}
