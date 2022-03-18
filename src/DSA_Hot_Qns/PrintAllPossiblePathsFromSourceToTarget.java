package DSA_Hot_Qns;
import java.util.ArrayList;

public class PrintAllPossiblePathsFromSourceToTarget {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 } };
		System.out.println(findPath(mat,mat.length,mat[0].length));

	}
	
	public static ArrayList<String> findPath(int[][] m, int mm,int nn) {
        
        ArrayList<String> result = new ArrayList();
       if(m[0][0]==0 || m[mm-1][nn-1]==0)
           return result;
       
       boolean[][] visited = new boolean[mm][nn];
      
       String path = "";
       dfs(0,0,m,mm,nn,path,result,visited);
       return result;
   }
   
   private static void dfs(int i,int j,int[][]mat,int mm,int nn,String path, ArrayList<String> result,boolean[][] visited ){
       
       if(i<0|| j<0||i>=mm||j>=nn|| visited[i][j]==true|| mat[i][j]==0)
       return;
     
       if(i==mm-1 && j==nn-1){
        
           result.add(path+mat[i][j]);
           return;
       }
       
       visited[i][j]=true;
       dfs(i+1,j,mat,mm,nn,path+ mat[i][j],result,visited);
       dfs(i,j+1,mat,mm,nn,path+mat[i][j],result,visited);
      
       visited[i][j]=false;
       
   }

}
