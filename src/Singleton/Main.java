package Singleton;

public class Main {

	public static void main(String[] args) {
		
		SingletonEarly obj1 = SingletonEarly.getInstance();
		SingletonEarly obj2 = SingletonEarly.getInstance();
		
		System.out.println(obj1==obj2);
	}

}
