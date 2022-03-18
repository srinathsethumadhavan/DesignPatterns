package DSA_Hot_Qns;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MaximumSubarraySumAtmostK {

	public static void main(String[] args) {
		int[] sum = {1, 2, 1, 0, 1, -8, -9, 0};
		int k =4;
		//System.out.println(find(sum,k));
		for(int i=-17;i<=k;i++)
		System.out.println(maxSubArrayLen(sum,i));
	}
	
	private static int find(int[] sum, int k) {
	    int result = Integer.MIN_VALUE;
	    TreeSet<Integer> set = new TreeSet<>();
	    set.add(0);
	    int prefixSum = 0;
	   
	    for(int i = 0; i < sum.length; i++) {
	      prefixSum += sum[i];

	      Integer target = set.ceiling(prefixSum - k);

	      if(target != null) {
	    	result =   Math.max(result, prefixSum-target);
	       
	      }
	      set.add(prefixSum);
	    }
	    System.out.println(result);
	    return result;
	  }
	
	
public static int maxSubArrayLen(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap();
        int n = nums.length;
        int max = 0;
        int sum = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];


            if(map.containsKey(sum-k)){
                max = Math.max(max,i-map.get(sum-k));
            }
            
            if(!map.containsKey(sum))
                map.put(sum,i);
            
        }

        return max;
    }

}
