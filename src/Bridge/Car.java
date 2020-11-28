package Bridge;

class Car extends Vehilce {

	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		
	}

	@Override
	public void manufacture() {
		
		workshop1.work();
		
		workshop2.work();
	}

}
