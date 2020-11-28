package State;

public class Order {

	private OrderState state;
	
	protected Order() {
		super();
		this.state = new New();
	}

	public double cancel() throws Exception {
	double charges = state.handleCnacellation();
	this.state = new Cancelled();
	return charges;
	}
	
	public void paymentSuccessful() {
		this.state = new Paid();
	}
	
	public void dispatched() {
		this.state = new InTransit();
	}
	
	public void delivered() {
		this.state = new Delivered();
	}
}
