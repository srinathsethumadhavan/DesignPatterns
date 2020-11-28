package Observer;

public class QuantityObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		System.out.println("Q****************");
		int totalCount = order.getCount();
		if(totalCount>1)
			order.setDiscount(70);
		else if(totalCount>2)
			order.setDiscount(30);
		
	}

}
