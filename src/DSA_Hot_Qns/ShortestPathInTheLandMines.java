package DSA_Hot_Qns;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInTheLandMines {

	public static void main(String[] args) {
		
		int[][] mat = {
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		        { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
		        { 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 },
		        { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		        { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
		        { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
		        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		        { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		        { 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 } };
		 
		int ans = findShortestPath(mat);
		
		System.out.println(ans);
		
	}
	
	
	private static int  findShortestPath(int[][] mat) {
		int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
		
		int m = mat.length;
		int n = mat[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==0) {
					markAdjacents(i,j,dir,m,n,mat);
				}
			}
		}
		
		Queue<int[]> queue = new LinkedList();
		boolean[][] visited = new boolean[m][n];
		for(int i=0;i<m;i++) {
			if(mat[i][0]==1)
				queue.add(new int[] {i,0,0});
				visited[i][0]=true;
		}
		
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			
			if(current[1]==n-1 && mat[current[0]][current[1]]==1)
				return current[2];
			
			for(int[] d : dir) {
				int x = current[0]+d[0];
				int y = current[1]+d[1];
				
				if(x>=0 && x<m && y>=0 && y<n && visited[x][y]==false && mat[x][y]==1) {
					visited[x][y]=true;
					queue.add(new int[] {x,y,current[2]+1});
				}
					
			}
		}
		
		
		return -1;
		
	}

	
	private static  void markAdjacents(int i ,int j,int[][] dir,int m,int n,int[][] mat) {
		
		for(int[] d : dir) {
			int x = i+d[0];
			int y = j+d[1];
			
			if(x>=0 && x<m && y>=0 && y<n)
				mat[x][y]=-1;
		}
	}
}
