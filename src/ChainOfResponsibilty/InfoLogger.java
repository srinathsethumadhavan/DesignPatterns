package ChainOfResponsibilty;

public class InfoLogger extends AbstractLogger {

	protected InfoLogger(int level) {
		super(level);
		
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Info::Logger: " + message);
		
	}

}
