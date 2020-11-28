package Strategy;

public class Context {

	private Operation operation;

	public Context(Operation operation) {
		super();
		this.operation = operation;
	};
	
	public void executeOperation(int a,int b){
		this.operation.doOperation(a, b);
	}
	
}
