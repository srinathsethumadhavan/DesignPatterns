package DSA_Hot_Qns;

public class SubarraySumLessThanK {

	
	private static void main(String[] args) {
		int[] nums = {1, 2, 1, 0, 1, -8, -9, 0};
		int k = 4;
		System.out.println(numSubarrayProductLessThanK(nums,k));
		
	}
	
	 public static  int numSubarrayProductLessThanK(int[] nums, int k) {
	        
	      
	        int sum = 0;
	        
	        int right = 0;
	        int n = nums.length;
	        int left =0;
	        
	        int max =0;
	        while(right<n){
	            sum+=nums[right];
	            while(sum>=k){
	                sum = sum-nums[left];
	                left++;
	            }
	            
	          max =  Math.max(max, right-left+1);
	          right++;
	                
	        }
	        
	        return max;
	    }
}
