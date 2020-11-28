package Strategy;

public class Client {

	public static void main(String[] args) {
		
		Operation operation = new AddOperation();
		Context context = new Context(operation);
		context.executeOperation(1,2);
		 operation = new SubOperation();
		 context = new Context(operation);
		 context.executeOperation(1,2);

	}

}
