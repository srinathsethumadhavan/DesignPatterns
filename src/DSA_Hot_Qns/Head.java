package DSA_Hot_Qns;
import java.util.TreeMap;

public class Head {

	public static void main(String[] args) {
		 TreeMap<Integer, String> dataTreeMap = new TreeMap<Integer, String>();
	       dataTreeMap.put(1, "JavaGoal");
	       dataTreeMap.put(5, "Hi");
	       dataTreeMap.put(2, "Learning");
	       dataTreeMap.put(4, "Hello");
	       dataTreeMap.put(3, "Website");
	       
	       System.out.println("HeadMap from TreeMap: "+ dataTreeMap.headMap(3));
	}

}
