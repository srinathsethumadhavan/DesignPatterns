package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.List;

public class Solutions {

	public static void main(String[] args) {
		
		String str = "ABC";
		
		char[] arr =str.toCharArray();
		
		System.out.println(permute(arr));

	}
public static List<String> permute(char[] nums) {
        
	List<String> res = new ArrayList<>();
        if(nums==null || nums.length==0)
            return res;
         StringBuffer permutation = new StringBuffer();        
        boolean[] used = new boolean[nums.length];
        helper(nums,permutation,res,used);
        return res;
    }
    
    public static  void helper(char[] nums,StringBuffer permutation , List<String> res, boolean[] used ){
        if(nums.length==permutation.length())
        {
            res.add(permutation.toString());
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true)
                continue;
            used[i]=true;
            permutation.append(nums[i]);
            helper(nums,permutation,res,used);
            permutation.deleteCharAt(permutation.length()-1);
            used[i]=false;
        }
        
    }

}


    
