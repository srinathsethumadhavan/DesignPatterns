package State;

public class Delivered implements OrderState{

	@Override
	public double handleCnacellation() {
		
		System.out.println("contacting the courier servcie to pickup the order");
		System.out.println("contacting the payment gateway to refund the charges");
		return 30;
	}

}
