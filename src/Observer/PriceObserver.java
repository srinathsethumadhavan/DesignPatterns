package Observer;

public class PriceObserver implements OrderObserver{

	@Override
	public void updated(Order order) {
		System.out.println("P****************");
		int totalCost = order.getTotalCost();
		if(totalCost>500)
			order.setDiscount(20);
		else if(totalCost>1000)
			order.setDiscount(30);
	}

}
