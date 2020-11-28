package Command;

public class Stock {

	private int quantity = 3;
	private String name = "ABC";
	
	public void buy() {
		 System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
	}
	public void sell() {
		 System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
	}
}
