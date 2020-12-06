package FlyWeight;

import java.util.Random;

public class CounterStrike {
	
	static String[] playerTypes = new String[]{"Terrorists","Counter Terrorists"};
	static String[] weaponTypes = new String[]{"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

	public static void main(String[] args) {
		int a =1;
		
		for(int i=0;i<Integer.MAX_VALUE;i++){
			Player p = PlayerFactory.getPlayer(getRandPlayerType());
			p.assignWeapon(getRandWeapon());
			System.out.println(a++);
			p.mission();
		}

	}

	private static String getRandWeapon() {
		Random rand  = new Random();
		int i = rand.nextInt(weaponTypes.length);
		return weaponTypes[i];
		
	}

	private static String getRandPlayerType() {
		Random rand  = new Random();
		int i = rand.nextInt(playerTypes.length);
		return playerTypes[i];
	}

}
