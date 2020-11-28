package Singleton;

public class SingletonLazyHolder {

	
	private SingletonLazyHolder() {
		System.out.println("in the SingletonLazyHolder class");
	}
	
	private static  class innerClass{
		
	static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	
	public static SingletonLazyHolder getInstance() {
		

		return innerClass.instance;
	}
}
