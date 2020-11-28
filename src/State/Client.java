package State;

public class Client {
 public static void main(String[] args) throws Exception {
	 
	 Order order = new Order();
	 System.out.println(order.cancel());
	 order.paymentSuccessful();
	 System.out.println(order.cancel());
	 order.dispatched();
	 System.out.println(order.cancel());
	 order.delivered();
	 System.out.println(order.cancel());
	 
	 order.cancel();
 }
}
