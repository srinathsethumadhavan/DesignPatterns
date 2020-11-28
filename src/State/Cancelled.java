package State;

public class Cancelled implements OrderState {

	@Override
	public double handleCnacellation() throws Exception {
		throw new Exception("Order is already cancelled, nothing to cancel");
		
	}

}
