package DSA_Hot_Qns;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Diameter_of_N_ary_Tree_BFS {
	
	
	public static void main(String[] args) {
		
		
		int[][] edges = {{1,2},{2,3},{3,4},{1,6},{6,5},{6,8},{8,7},{7,13},{1,12},{12,10},{10,9},{10,11},{0,3},{16,15},{15,14},{14,2}};
	Map<Integer,Set<Integer>> adj = buildGraph(edges);
	
	//System.out.println(adj);
	int[] arr = BFSApproach(adj,17,0);
	int newSource =arr[0];
	int[] res = BFSApproach(adj,17,newSource);
	
	System.out.println(arr[0] +"----"+ res[0]+ " length "+ res[1]);
}
	
	
	
	
	
	public static int[] BFSApproach(Map<Integer,Set<Integer>> adj,int n,int s) {
		
		Set<Integer> visited = new HashSet<Integer>();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] d = new int[n];
		Arrays.fill(d, -1);
		d[s]=0;
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int u = queue.poll();
			
			visited.add(u);
			
			for(Integer v : adj.get(u)) {
				if(!visited.contains(v)) {
					queue.add(v);
					d[v]=d[u]+1;
				}
			}
		}
		
		
		int maxDistance = -1;
		int node =-1;
		for(int i=0;i<n;i++) {
			
			if(maxDistance<d[i]) {
				maxDistance=d[i];
				node = i;
			}
		}
		
		return new int[]{node,maxDistance};
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
