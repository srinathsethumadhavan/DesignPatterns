package DSA_Hot_Qns;

public class CountSubsequencesLessThanEqualsK {

	
	//https://www.youtube.com/watch?v=iOjV84903WA
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		
		int k = 10;
				int n = arr.length;
		int[][]dp = new int[k+1][n+1];
		
		for(int i=1;i<=k;i++) // product value
			for(int j=1;j<=n;j++) {// elements 
				
				dp[i][j]=dp[i][j-1];
				if(arr[j-1]<=i && arr[j-1]>0)
					dp[i][j]+=1+dp[i/arr[j-1]][j-1];
				
			}
		
		System.out.println(dp[k][n]);
	}
	
	
	
	
	

}
