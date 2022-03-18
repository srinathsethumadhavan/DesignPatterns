package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

	static  class Pair{
	    int x;
	    int y ;
	    Pair(){
	        
	    }
	    Pair(int x,int y){
	        this.x = x;
	        this.y = y;
	    }
	 }
	public static void main(String[] args) {
		
		
		String s = "addbsd";
		System.out.println(s.substring(6));
	//	System.out.println(findTheLongestSubstring(s));
//		int[][] edges = new int[][] {{1,0},{1,2},{1,3}};
//		int n =4;
//		
//		Queue<Pair> queue = new LinkedList();
//		queue.add(new Pair(1,1));
//		
//		List<List<Integer>> adjList = new ArrayList(n);
//	      
//        for(int i=0;i<n;i++)
//            adjList.add(new ArrayList());
//        
//        int[] indegrees = new int[n];
//        
//        for(int[] edge : edges){
//            adjList.get(edge[0]).add(edge[1]);
//            adjList.get(edge[1]).add(edge[0]);
//            indegrees[edge[0]]++;
//            indegrees[edge[1]]++;
//        }
//        
//        System.out.println(adjList);
//       
//        
//        
//        for(int i=0;i<n;i++) {
//        	
//        	 boolean[]visited = new boolean[n];
//        	 Integer d =0;
//        	
//        		dfs(adjList,i,visited,d);
//        		 System.out.println("Depth "+d);
//        }
//		
	}
	
public static int findTheLongestSubstring(String s) {
        
        
        int end = 0;
        int temp=0;
        int start = 0;
       boolean flag = false;  

        for(int i=0;i<s.length();i++){
        int aCount=0;
        int eCount=0; 
        int oCount=0; 
        int uCount=0; 
        int iCount=0;
       
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='a')
                    aCount++;
                if(s.charAt(j)=='e')
                    eCount++;
                if(s.charAt(j)=='i')
                    iCount++;
                if(s.charAt(j)=='o')
                    oCount++;
                if(s.charAt(j)=='u')
                    uCount++;
                
                    if(temp<j-i+1 && aCount%2==0 && eCount%2==0 && iCount%2==0 && oCount%2==0 && uCount%2==0){
                        start= i;
                        end = j;
                        temp = end-start+1;
                        flag = true;
                    }
                }
            }
        
     
        if(flag)
            
         return end-start+1;
        else
            return 0;
    }
	private static  void dfs(List<List<Integer>> adjList,int u, boolean[]visited,  Integer d ) {
		visited[u]=true;
		
		
		for(int v : adjList.get(u)) {
			if(visited[v]==false)
				dfs(adjList,v,visited,d+1);
		}
		
		
	}
}
