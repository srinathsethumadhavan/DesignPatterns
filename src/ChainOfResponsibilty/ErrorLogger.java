package ChainOfResponsibilty;

public class ErrorLogger extends AbstractLogger {


	protected ErrorLogger(int level) {
		super(level);
	
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard error::Logger: " + message);
		
	}

}
