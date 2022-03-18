package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.Collections;

public class err {

	public static void main(String[] args) {
		
		System.out.println(maxIndexDiff(new int[]{34, 8, 10, 3, 2, 80, 30, 33, 1},9));
	
		

	}

	

	static int maxIndexDiff(int arr[], int n) { 
	       
	    
	       ArrayList<int[]> list = new ArrayList();
	       for(int i = 0;i<arr.length;i++){
	           list.add(new int[]{i,arr[i]});
	       }
	        
	        Collections.sort(list,(arr1,arr2)->arr1[1]-arr2[1]);
	        
	        int min = Integer.MAX_VALUE;
	        int result =-1;
	        for(int i=0;i<n;i++){
	            min = Math.min(list.get(i)[0],min);
	            result = Math.max(result,list.get(i)[0]-min);
	        }
	        
	        return result;
	    }
}
