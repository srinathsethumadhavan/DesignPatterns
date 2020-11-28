package Decorator;

public class HtmlMessageDecorator implements Message{

	private Message message;

	public HtmlMessageDecorator(Message message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		
		String msg = message.getMessage();
		return msg+"HTML";
	}
	
	
}
