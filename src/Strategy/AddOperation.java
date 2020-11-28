package Strategy;

public class AddOperation implements Operation{

	@Override
	public void doOperation(int a,int b) {
		
		System.out.println(a+b);
	}

}
