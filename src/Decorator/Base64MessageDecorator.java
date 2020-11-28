package Decorator;

public class Base64MessageDecorator implements Message {

	
	private Message message;
	@Override
	
	public String getMessage() {
		String str = message.getMessage();
		return str+ "Base64";
	}
	public Base64MessageDecorator(Message message) {
		super();
		this.message = message;
	}

	
}
