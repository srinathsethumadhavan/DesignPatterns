package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class PrintShortestPathDjikshtra {

	public static void main(String[] args) {
		

		int[][] edges = {{0,2,3},{0,1,1},{0,3,2},{2,4,2},{2,5,4},{3,5,2},{1,4,1},{4,5,1}};
		System.out.println(shortestPath(6,edges));
	}

	
	private static List<Integer> shortestPath(int V,int[][] edges) {
		
		HashMap<Integer,ArrayList<ArrayList<Integer>>> map = new HashMap();
		
		buildGraph(map,edges);
		
		//System.out.println(map);
		int source = 0;
		int destination = V-1;
		return djikstra(map,V,source,destination);
		
	}
	
	private static List<Integer> djikstra(Map<Integer,ArrayList<ArrayList<Integer>>> map,int V,int s,int x) {
		
		int[] d = new int[V];
		Arrays.fill(d, Integer.MAX_VALUE);
		d[s]=0;
		
		int [] parent = new int[V];
		Arrays.fill(parent,-1);
		
		
		
		PriorityQueue<int[]> queue =  new PriorityQueue<int[]>((a,b)-> a[1]-b[1]);
		
		queue.add(new int[] {s,0});
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int u = current[0];
			for(List<Integer> neigh : map.get(u)) {
				int v  = neigh.get(0);
				int w = neigh.get(1);
				
				if(d[v]>d[u]+w ) {
					d[v]=d[u]+w;
					parent[v] = u;
					queue.add(new int[] {v,d[v]});
				}
			}
		}
		
		
		//System.out.println(Arrays.toString(d));
	//	System.out.println(Arrays.toString(parent));
		
		List<Integer> shortestroute  = new ArrayList();
		if(d[x]!=Integer.MAX_VALUE ) {
			while(x!=-1) {
				shortestroute.add(0,x);
				x = parent[x];
			}
			
		}
		
		return shortestroute;
	}
	
	private static void buildGraph(Map<Integer,ArrayList<ArrayList<Integer>>> map ,int[][] edges) {
		
		for(int[] edge: edges) {
			int u= edge[0];
			int v = edge[1];
			int w = edge[2];
			
			if(!map.containsKey(u))
				map.put(u,new ArrayList<ArrayList<Integer>>());
			if(!map.containsKey(v))
				map.put(v,new ArrayList<ArrayList<Integer>>());
			
			ArrayList<Integer> temp1 = new ArrayList<Integer>();

			ArrayList<Integer> temp2 = new ArrayList<Integer>();
			
			temp1.add(v);
			temp1.add(w);
			
			temp2.add(u);
			temp2.add(w);
			
			map.get(u).add(temp1);
			map.get(v).add(temp2);
			
			
		}
	}
}
