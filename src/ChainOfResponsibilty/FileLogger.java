package ChainOfResponsibilty;

public class FileLogger extends AbstractLogger {

	protected FileLogger(int level) {
		super(level);
		
	}

	@Override
	protected void write(String message) {
		 System.out.println("Standard File::Logger: " + message);
	}

}
