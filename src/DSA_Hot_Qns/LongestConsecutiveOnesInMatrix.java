package DSA_Hot_Qns;

public class LongestConsecutiveOnesInMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,0},{0,1,1,0},{0,0,0,1}};
		int res = longestIncreasingPath(matrix);
		System.out.println(res);
	}

	
	 public static int longestIncreasingPath(int[][] matrix) {
	        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int longestPath =0;
	        int[][] mem = new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	            	if(matrix[i][j]==1) {
	            		int path = dfs(m,n,i,j,matrix,dir,mem,new boolean[m][n]);
	            		System.out.println("i "+ i + "j " + j + " "+path);
		                longestPath = Math.max(longestPath,path);
	            	}
	                
	            }
	        }
	        
	        return longestPath;
	    }
	 
	 
	   
	    private static int dfs(int m,int n, int i,int j,int[][] matrix,int[][] dir,int[][] mem,boolean[][] visited){
	        
	       
	        
	        visited[i][j]=true;
	        int max =0;
	        for(int[] d : dir){
	            int x = i+d[0];
	            int y = j+d[1];
	            if(x>=0 && x<m && y>=0 && y<n && 1==matrix[x][y] && visited[x][y]==false)
	            max = Math.max(max,dfs(m,n,x,y,matrix,dir,mem,visited));
	        }
	        
	       
	        return  max+1;
	    }
}
