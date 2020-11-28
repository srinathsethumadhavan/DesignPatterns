package Memento;

class Memento {

	private String state;

	protected Memento(String state) {
		super();
		this.state = state;
	}

	
	public String getState() {
		
		return this.state;
	}
	
	
}
