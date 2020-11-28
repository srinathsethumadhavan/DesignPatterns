package Observer;

public class Client {

	public static void main(String[] args) {
		Order order = new Order(1);
		order.addItem(1000);
		System.out.println(order.toString());
		QuantityObserver quantityOberser = new QuantityObserver();
		PriceObserver priceObserver = new PriceObserver();
		
		order.attach(priceObserver);
		
		order.addItem(1000);
		System.out.println(order);
		//order.detach(priceObserver);
		order.attach(quantityOberser);
		order.addItem(1000);
		System.out.println(order);
	}
}
