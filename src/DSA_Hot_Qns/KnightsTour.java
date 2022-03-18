package DSA_Hot_Qns;
import java.util.Arrays;

public class KnightsTour {

	/*
	 * 
	 * Time Complexity : 
There are N^2 Cells and for each, we have a maximum of 8 possible moves to choose from, 
so the worst running time is O(8^(N^2)).

Auxiliary Space: O(N^2)
	 */
	static int count =0;
	public static void main(String[] args) {
		
		int[][] mat  = new int[8][8];
		
		for(int i=0;i<8;i++)
			Arrays.fill(mat[i], -1);
		
		solve(0,0,mat);
		
		for(int i=0;i<8;i++)
			System.out.println(Arrays.toString(mat[i]));
	}
	
	

	
	private static void solve(int i ,int j,int[][] mat) {
		
		if(i<0 || j<0 || i>=8 || j>=8 || mat[i][j]!=-1)
	        return;
		
		
		
		mat[i][j]=count++;
		solve(i-1,j+2,mat);
	    solve(i-1,j-2,mat);
	    solve(i+1,j+2,mat);
	    solve(i+1,j-2,mat);
	    solve(i-2,j+1,mat);
	    solve(i-2,j-1,mat);
	    solve(i+2,j+1,mat);
	    solve(i+2,j-1,mat);
	    
	    
	}

}
