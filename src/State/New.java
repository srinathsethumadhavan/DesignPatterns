package State;

public class New implements OrderState {

	@Override
	public double handleCnacellation() {
		System.out.println(" order is not processed , no payment done");
		return 0;
	}

	
}
