package State;

public class InTransit  implements OrderState{

	@Override
	public double handleCnacellation() {
		System.out.println("contacting the courier servcie to revet back the order");
		System.out.println("contacting the payment gateway to refund the amount");
		return 20;
	}

	
}
