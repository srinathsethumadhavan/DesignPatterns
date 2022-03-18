package DSA_Hot_Qns;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Diameter_of_N_ary_Tree_DFS {
	
	
	
	static int maxDistance =0;
	static int node =-1;
	public static void main(String[] args) {
		
		
		int[][] edges = {{1,2},{2,3},{3,4},{1,6},{6,5},{6,8},{8,7},{7,13},{1,12},{12,10},{10,9},{10,11},{0,3},{16,15},{15,14},{14,2}};
	Map<Integer,Set<Integer>> adj = buildGraph(edges);
	
	
	
	
	Set<Integer> visited = new HashSet<Integer>();
	
	dfs(adj,visited,0,0);
	
	System.out.println(maxDistance +" "+ node);
	
	int source = node;
	
	maxDistance  = 0;
	visited.clear();
	dfs(adj,visited,node,0);
	
	
	System.out.println(maxDistance +" "+ node +":  " + source);
}
	
	
	
	public static void dfs(Map<Integer,Set<Integer>> adj,Set<Integer> visited,int u,int length) {
	
		
		visited.add(u);
		
		if(maxDistance<length) {
			maxDistance = length;
			node = u;
		}
		
		
		for(Integer v : adj.get(u)) {
			if(!visited.contains(v)) {
				dfs(adj,visited,v,length+1);
			}
		}
	}
	
	
	
	
	
	
	public static  Map<Integer,Set<Integer>> buildGraph(int[][] edges){

		Map<Integer,Set<Integer>> map = new HashMap<Integer,Set<Integer>>();
        
        
        for(int[] edge : edges){
            
            int u = edge[0];
            int v = edge[1];
            if(!map.containsKey(u))
                map.put(u,new HashSet<Integer>());
                
             if(!map.containsKey(v))
                map.put(v,new HashSet<Integer>());   
                
            map.get(u).add(v);
            map.get(v).add(u);
        }
        return map;
	}

}
