package ChainOfResponsibilty;

public class Main {

	public static void main(String[] args) {
	
		
		AbstractLogger loggerChain  = getChainOfError();
		String message = "this is my message";
		loggerChain.logMessage(AbstractLogger.INFO, message);
		
		loggerChain.logMessage(AbstractLogger.ERROR, message);
		
		loggerChain.logMessage(AbstractLogger.FILE, message);
		loggerChain.logMessage(AbstractLogger.test, message);
		}
	
	
	private static  AbstractLogger getChainOfError() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.FILE);
		
		errorLogger.setNextLogger(infoLogger);
		infoLogger.setNextLogger(fileLogger);
		
		return errorLogger;
	}
	

}
