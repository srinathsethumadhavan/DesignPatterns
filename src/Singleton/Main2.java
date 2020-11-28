package Singleton;

public class Main2 {

	public static void main(String[] args) {
		SingletonLazy obj1 = SingletonLazy.getInstance();
		SingletonLazy obj2 = SingletonLazy.getInstance();
		
		System.out.println(obj1==obj2);

	}

}
