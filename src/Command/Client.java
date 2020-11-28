package Command;

public class Client {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		Broker broker= new Broker();
		broker.add(buyStock);
		broker.add(sellStock);
		broker.placeOrders();

	}

}
