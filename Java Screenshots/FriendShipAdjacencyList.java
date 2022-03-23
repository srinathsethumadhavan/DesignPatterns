package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FriendShipAdjacencyList {

	public static void main(String[] args) {
		
		/*
		 * Friendship Adjacency List
You are creating a local networking webapp for your neighborhood. You have two data sets to work with. 

The first data set is the list of people who live in the neighborhood.
The second data set is all the pairs of neighbors who are already friends.

The goal is to write functionality that will be able determine, based on the provided input data, who is friends with whom.

Input arguments to the program look like this:

    String[] neighborsInput = {
      "1,John",
      "2,Frank",
      "3,Nolan",
      "4,Monica",
      "6,Vera"
    };

    String[] friendshipsInput = {
      "1,2",
      "1,3",
      "2,4"
    };

A valid output could look like this:

        # 1: 2, 3
    # 2: 1, 4
    # 3: 1
    # 4: 2
    # 6: None
 
		 */
		
		
		
		String[]  friendshipsInput= new String[3];
		
		friendshipsInput[0]= "1,2";
		friendshipsInput[1]= "1,3";
		friendshipsInput[2]= "2,4";
		
		
		
		
String[] neighborsInput = new String[5];
		
		neighborsInput[0]="1,John";
		neighborsInput[1]="2,Frank";
		neighborsInput[2]="3,Nolan";
		neighborsInput[3]="4,Monica";
		neighborsInput[4]="6,Vera";
		
		formAdjacencyList(neighborsInput,friendshipsInput);
	}
	
	
	private static void formAdjacencyList(String[] neighborsInput ,String[] friendshipsInput) {
		
		
		Map<Integer,HashSet<Integer>> map = new HashMap();
		for(String s :neighborsInput ) {
			String[] arr = s.split(",");
			int key = Integer.parseInt(arr[0]);
			if(!map.containsKey(key))
				map.put(key, new HashSet());
		}
		
		
		for(String s :friendshipsInput ) {
			String[] arr = s.split(",");
			int u = Integer.parseInt(arr[0]);
			int v = Integer.parseInt(arr[1]);
		
			
			map.get(u).add(v);
			map.get(v).add(u);
				
		}
		
		
		
		for(Integer key : map.keySet()) {
			System.out.println(key + ":" +map.get(key));
		}
	}

}
