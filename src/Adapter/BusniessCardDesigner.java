package Adapter;

public class BusniessCardDesigner {

	
private String card ="";
public String designCard(Customer customer) {
	
	card+=customer.getName();
	card+=customer.getAddress();
	card+=customer.getDesignation();
	return card;
	
}
}
