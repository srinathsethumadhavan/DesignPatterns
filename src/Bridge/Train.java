package Bridge;

public class Train  extends Vehilce{

	public Train(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		
	}

	@Override
	public void manufacture() {
		workshop1.work();
		workshop2.work();
		
	}

}
