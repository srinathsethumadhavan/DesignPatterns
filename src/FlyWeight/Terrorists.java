package FlyWeight;

public class Terrorists implements Player{

	
	private String weapon ;
	
	private String task;
	
	public Terrorists(){
		this.task="plant many bombs";
	}
	@Override
	public void mission() {
		
		System.out.println("Terrorist task is to "+this.task+"with the weapon"+this.weapon);
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
		
	}

}
