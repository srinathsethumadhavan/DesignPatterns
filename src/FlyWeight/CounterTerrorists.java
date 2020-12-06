package FlyWeight;

public class CounterTerrorists implements Player {

	private String task;
	private String weapon;
	@Override
	
	
	public void mission() {
		
		System.out.println("Counter Terrorist task is to "+this.task+"with the weapon"+this.weapon);
	}

	public CounterTerrorists() {
		super();
		this.task ="diffuse all the bombs";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
		
	}
	
	
}
