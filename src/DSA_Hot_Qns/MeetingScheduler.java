package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingScheduler {

	public static void main(String[] args) {
		
		int[][] first = {{10,50},{60,120},{140,210}};
		int[][] second = {{0,15},{60,70}};
		int duration = 12;
		System.out.println(Arrays.toString(intervalIntersection(first,second,duration)));

	}
	
	 public static int[] intervalIntersection(int[][] firstList, int[][] secondList,int duration) {
	        
		 Arrays.sort(firstList,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
		 Arrays.sort(secondList,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);

		 
	        List<int[]> list = new ArrayList();
	        int m = firstList.length;
	        int n = secondList.length;
	        int i=0;
	        int j=0;
	        
	        while(i<m && j<n){
	            int s1= firstList[i][0];
	            int e1= firstList[i][1];
	            int s2= secondList[j][0];
	            int e2= secondList[j][1];
	            
	            if(e1>=s2 && e2>=s1){
	                int start = Math.max(s1,s2);
	                int end = Math.min(e1,e2);
	        
	                if(end-start>=duration)
	                	return new int[] {start,start+duration};
	                
	            }
	            
	            if(e1<e2)
	                i++;
	            else 
	                j++;
	        }
	        
	        
	        return new int[] {};
	    }

}
