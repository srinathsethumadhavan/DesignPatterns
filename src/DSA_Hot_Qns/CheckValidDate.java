package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.List;

public class CheckValidDate {
	
	
	static int MAX_YEAR = 9999;
	static int  MIN_YEAR = 1000;
	public static void main(String[] args) {
		
		
		
		
		List<List<Integer>> list = permute(new int[] { 1, 32, 1990});
		System.out.println(list);
		
		for(List<Integer> l : list) {
			if(checkDate(l)) {	
				System.out.println("valid");
				return;
			}
				
				
		}
		
		System.out.println("Not valid");
		
		}
	
	
	public static boolean checkDate(List<Integer> arr){
		
		/*
		 * dd --mm -- yy
		 */
		
		
		if(arr.get(0)<0 || arr.get(0)>31)
			return false;
		if(arr.get(1)<0 || arr.get(1)>12)
			return false;
		if(arr.get(2)<MIN_YEAR || arr.get(2)>MAX_YEAR)
			return false;
		
		
		if(arr.get(1)==4 || arr.get(1)==6 || arr.get(1)==8|| arr.get(1)==11)
			return arr.get(0)<=30;
		
		if(arr.get(1)==2) {
			if(isLeapYear(arr.get(2)))
				return arr.get(0)<=29;
			else
				return arr.get(0)<=28;
		}
		
		return true;
	}


	private static boolean isLeapYear(int year) {
	
		return (((year % 4 == 0) &&
				(year % 100 != 0)) ||
				(year % 400 == 0));
		
	}
	
	
	 public static List<List<Integer>> permute(int[] nums) {
	        
	        List<List<Integer>> res = new ArrayList<>();
	        if(nums==null || nums.length==0)
	            return res;
	        List<Integer> permutation = new ArrayList<>();        
	        boolean[] used = new boolean[nums.length];
	        helper(nums,permutation,res,used);
	        return res;
	    }
	    
	    public static void helper(int[] nums,List<Integer> permutation ,  List<List<Integer>> res, boolean[] used ){
	        if(nums.length==permutation.size())
	        {
	            res.add(new ArrayList<>(permutation));
	            return;
	        }
	        for(int i=0;i<nums.length;i++){
	            if(used[i]==true)
	                continue;
	            used[i]=true;
	            permutation.add(nums[i]);
	            helper(nums,permutation,res,used);
	            permutation.remove(permutation.size()-1);
	            used[i]=false;
	        }
	        
	    }

}
