package DSA_Hot_Qns;
import java.util.HashMap;
import java.util.Map;

class Testing{
	public static void main(String[] args) {

	    Map<Integer,Integer> map = new HashMap();
	    
	    int[] arr = {3,3,4,2,1,4,5,6,3,1,3,0,6};
	    int n = arr.length;
	    int target = 6;
	    for(int i=0;i<n;i++){

	        int k = target -arr[i];
	        if(map.containsKey(k)){
	            System.out.println(arr[i]+ " "+ k);
	            map.put(k,map.getOrDefault(k,0)-1);
	            if(map.get(k)==0)
	                map.remove(k);
	        }else

	        	map.put(arr[i],map.getOrDefault(arr[i],0)+1);


	    }
	}
}