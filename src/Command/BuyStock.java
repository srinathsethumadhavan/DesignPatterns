package Command;

public class BuyStock implements Order{

	private Stock stock;
	
	protected BuyStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		this.stock.buy();
		
	}
	


}
