package Bridge;

public abstract class Vehilce {

	protected Workshop workshop1;
	protected Workshop workshop2;
	public Vehilce(Workshop workshop1, Workshop workshop2) {
		super();
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	public abstract void manufacture();
}
