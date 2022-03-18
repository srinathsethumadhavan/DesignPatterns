package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

	public static void main(String[] args) {
		
		String[] input  = {"abcz","dexf","gohi"};
		System.out.println(letterCombinations(input));

	}
	
	
	   
	    
	    public static List<String> letterCombinations(String[] digits) {
	         List<String> result = new ArrayList();
	        
	        if(digits==null || digits.length==0)
	            return result;
	        helper(digits,result,0,"");
	        return result;
	    }
	    
	    
	    
	    private static void helper(String[] digits,List<String> result,int index,String current){
	        
	        if(index==digits.length){
	            result.add(current);
	            return;
	        }
	        
	        
	        String temp= digits[index];
	        
	        for(int i=0;i<temp.length();i++){
	            helper(digits,result,index+1,current+temp.charAt(i));
	        }
	    }
	}


