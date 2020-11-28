package Command;

import java.util.ArrayList;

public class Broker {

	private ArrayList<Order> stockOrdersList = new ArrayList<>();
	
	public void add(Order order) {
		this.stockOrdersList.add(order);
	}
	
	public void placeOrders() {
		for(Order orders :stockOrdersList )
			orders.execute();
		stockOrdersList.clear();
	}
	
	
}
