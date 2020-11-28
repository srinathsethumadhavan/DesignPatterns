package Bridge;

public class Main {

	public static void main(String[] args) {
		
		Workshop produce = new Produce();
		Workshop assemble = new Assemble();
		Workshop dismantle = new Dismantle();
		Vehilce car  = new Car(produce,dismantle);
		Vehilce bike  = new Bike(produce,dismantle);
		Vehilce train  = new Train(assemble,dismantle);

		car.manufacture();
		bike.manufacture();
		train.manufacture();
	}

}
