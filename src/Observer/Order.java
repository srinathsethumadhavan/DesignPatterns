package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private int count;
	private int totalCost;
	private double discount;
	
	
	private List<OrderObserver> observerList = new ArrayList<>();
	
	public void attach(OrderObserver observer) {
		observerList.add(observer);
	}
	
    public void detach(OrderObserver observer) {
	observerList.remove(observer);
	}
    
    
    
    
    protected Order(int id) {
		super();
		this.id = id;
	}

	public void addItem(double cost) {
    	totalCost+=cost;
    	count++;
    	observerList.forEach(obs->obs.updated(this));
    	
    }

	public int getCount() {
		return count;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", count=" + count + ", totalCost=" + totalCost + ", discount=" + discount + "]";
	}
   
    
    
    
	
	
}
