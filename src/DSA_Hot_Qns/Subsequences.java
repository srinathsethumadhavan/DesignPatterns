package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subsequences {

	
	public static void main(String[] args) {
		System.out.println(subsets(new char[] {'a','b','c'}));

	}
	
	
	    public static List<String> subsets(char[] cs) {
	        List<String> result = new ArrayList();
	      List<Character> list = new ArrayList();
	        
	        helper(result,list,0,cs);
	        
	        return result;
	    }
	    
	    
	    private static void helper(List<String> result,List<Character> list,int start,char[] nums){
	        
	        if(list.size()!=0)
	        result.add(list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining()));
	          
	        for(int i=start;i<nums.length;i++){
	            list.add(nums[i]);
	            helper(result,list,i+1,nums);
	            list.remove(list.size()-1);
	        }
	        
	    }
	}


