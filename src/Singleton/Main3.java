package Singleton;

public class Main3 {

	public static void main(String[] args) {
		SingletonLazyHolder obj1 = SingletonLazyHolder.getInstance();
		SingletonLazyHolder obj2 = SingletonLazyHolder.getInstance();
		SingletonLazyHolder.getInstance();
		SingletonLazyHolder.getInstance();
		SingletonLazyHolder.getInstance();
		System.out.println(obj1==obj2);

	}

}
