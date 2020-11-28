package Singleton;

public class SingletonLazy {

	
	private static volatile  SingletonLazy instance;
	private SingletonLazy() {
		
	}
	
	/*
	 * double check locking singleton lazy instantiation
	 */
	public static SingletonLazy getInstance() {
		
		if(instance==null)
		{
			synchronized (SingletonLazy.class) {
			if(instance== null)
					instance  = new SingletonLazy();
			}
		}
		
		return instance;
	}

	
}
