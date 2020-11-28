package ChainOfResponsibilty;

public abstract class  AbstractLogger {

	protected  int level;
	public  static int INFO=1;
	public  static int ERROR=2;
	public  static int FILE=3;
	public  static int test=4;
	protected AbstractLogger nextLogger;
	
	
	protected AbstractLogger(int level) {
		super();
		this.level = level;
	}

	public void setNextLogger(AbstractLogger nextLogger ) {
		this.nextLogger= nextLogger;
	}
	
	public void logMessage(int level, String message) {
		if(this.level==level)
			write(message);
		else
			{
			if(nextLogger!=null)
				nextLogger.logMessage(level,message);
			}
			
	}

	protected abstract void write(String message) ;
		
		

	
}
