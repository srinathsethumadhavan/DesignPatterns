package DSA_Hot_Qns;
import java.util.Arrays;

public class TEST {

	public static void main(String[] args) {
	
		
		/*
		 * Array = [1,2,3,1,2,3,1,2,3,1,2,3,4]
		Sort num = 2
			Output = [1,3,1,3,1,3,1,3,4,2,2,2,2]

Sort num = 1
Output = [2,3,2,3,2,3,2,3,4,1,1,1,1]
		 */
	
		int[] arr = {1,2,3,1,2,3,1,2,3,1,2,3,4};
		int target = 2;
		int n = arr.length;
		
		int index =0;
		int i;
		for( i=0;i<n;i++) {
			if(arr[i]!=target) {
				arr[index++]=arr[i];
			}
		}
		
		for(int j = index;j<n;j++)
			arr[j]=target;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
