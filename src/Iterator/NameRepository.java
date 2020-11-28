package Iterator;

public class NameRepository {

	static String[] names = new String[] {"A","B","C","D"};
	
	
	public static Iterator getIterator() {
		return new NameIterator();
	}
	private static class NameIterator implements Iterator{

		private int position;
		@Override
		public boolean hasNext() {
			if(position<names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
			return names[position++];
			return null;
			
		}
		
		
	}
}
