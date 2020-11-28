package State;

public class Paid implements OrderState{

	@Override
	public double handleCnacellation() throws Exception {
		System.out.println("contacting the payment service to refund");
		return 10;
	}
}
