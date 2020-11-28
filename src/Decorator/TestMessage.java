package Decorator;

public class TestMessage  implements Message{
	private String message;
	@Override
	
	
	
	public String getMessage() {
		
		return this.message ;
	}
	public TestMessage(String message) {
		super();
		this.message = message;
	}

}
