package Iterator;

public class Client {

	public static void main(String[] args) {
	
		NameRepository names = new NameRepository();
		Iterator itr  = names.getIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
