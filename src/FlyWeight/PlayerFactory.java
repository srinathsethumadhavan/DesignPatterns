package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

	
	private static Map<String,Player> map = new HashMap<>();
	
	public static Player getPlayer(String playerType){
		Player p = null;
		if(map.containsKey(playerType)){
			p = map.get(playerType);
			return p;
		}
		else {
			switch(playerType){
			case "Terrorists":
				System.out.println("Terrorists created");
				p = new Terrorists();
				break;
			case "Counter Terrorists":
				System.out.println("Counter Terrorists created");
				p = new CounterTerrorists();
				break;
			default:
				System.out.println("Invalid Type of Player");
			}
		}
		map.put(playerType, p);
		return p;
		
	}
}
