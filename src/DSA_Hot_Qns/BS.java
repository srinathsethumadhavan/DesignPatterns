package DSA_Hot_Qns;

public class BS {

	public static void main(String[] args) {
		
		
		int left =1;
		int right = Integer.MAX_VALUE;
		long S =90;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			//System.out.println(" left : "+left + " right : " + right + "  mid : "+ mid);
			if(isNsatisfied(mid,S)) {
				left = mid+1;
			}else
				right = mid-1;
		}
		
		System.out.println("ans : "+(left-1));

	}

	
	private  static boolean isNsatisfied(int mid,long S) {
		long sum =0;
		
		for(int i=1;i<=mid;i++) {
			for(int j=1;j<=mid;j++) {
				for(int k=1;k<=mid;k++) {
					sum+=i*k*(i+j+k);
					if(sum>S)
						return false;
				}
			}
		}
		return true;
		
	}
}
