package Command;

public class SellStock implements Order {
	
	private Stock stock;
	
	protected SellStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		
		this.stock.sell();
	}
}
