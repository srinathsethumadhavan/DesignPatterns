package DSA_Hot_Qns;
import java.util.HashSet;

public class Sollu {

	public static void main(String[] args) {
		//lengthOfLongestSubstring("abcabcbb");
		int[] nums = {5,-10,7,-20,57};
		int k =-22;
		System.out.println(numSubarrayProductLessThanK(nums,k));
		reverse(nums);
		System.out.println(numSubarrayProductLessThanK(nums,k));

	}
	
	private static void reverse(int[] nums) {
		int i=0;
		int j=nums.length-1;
		while(i<j) {
			int temp = nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;j--;
		}
	}
	 public static  int numSubarrayProductLessThanK(int[] nums, int k) {
	        
	      
	        int sum = 0;
	        
	        int right = 0;
	        int n = nums.length;
	        int left =0;
	        
	        int max =0;
	        while(right<n){
	            sum+=nums[right];
	            while(sum>=k && left<n){
	            	System.out.println("**");
	                sum = sum-nums[left];
	                left++;
	            }
	            
	          max =  Math.max(max, right-left+1);
	          right++;
	                
	        }
	        
	        return max;
	    }
	
	 public static int lengthOfLongestSubstring(String s) {
	        
	        if(s.length()==0)
	            return 0;
	        int max = Integer.MIN_VALUE;
	        HashSet<Character> set = new HashSet<>();
	        int i=0;
	        int j=0;
	        while(j<s.length()){
	            if(set.contains(s.charAt(j)))
	            {
	                set.remove(s.charAt(i));
	                i++;
	             }           
	                else{
	                    set.add(s.charAt(j));
	                    max = Math.max(max,set.size());
	                    j++;
	                }
	            System.out.println("i = " + i + "  j  = "+ j);
	            System.out.println(set);

	           
	        }
	        return max;
	    }

}
