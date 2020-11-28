package Decorator;

public class Client {

	public static void main(String[] args) {
		Message msg =new TestMessage("my message");
		System.out.println(msg.getMessage());
		 msg = new HtmlMessageDecorator(msg);
		System.out.println(msg.getMessage());
		msg = new Base64MessageDecorator(msg);
		System.out.println(msg.getMessage());
	}
	
}
