package Singleton;

public class SingletonEarly {

	private static final SingletonEarly instance = new SingletonEarly();
	
	private SingletonEarly() {
		super();
		
	}
		public static SingletonEarly getInstance() {
		return instance;
	}

	
	
}
