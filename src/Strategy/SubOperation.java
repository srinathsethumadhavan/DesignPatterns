package Strategy;

public class SubOperation implements Operation{

	@Override
	public void doOperation(int a, int b) {
		System.out.println(a-b);
		
	}

}
