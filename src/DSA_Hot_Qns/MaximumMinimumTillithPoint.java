package DSA_Hot_Qns;
import java.util.Arrays;
import java.util.Stack;

public class MaximumMinimumTillithPoint {
	static Stack<Integer> stack = new Stack();
	public static void main(String[] args) {
		
   
		
		
		int[] arr = new int[] {4,2,8,1,-1,3,0,9};
		int n = arr.length;
		int min = arr[0];
		int minEle = arr[0];
		
		int[] res = new int[n];
		res[0]=arr[0];
		for(int i=1;i<n;i++) {
			minEle = Math.min(arr[i],minEle);
			res[i] = Math.min(minEle, res[i-1]);
		}
		
		
		System.out.println(Arrays.toString(res));
		minimumTillIthPoint(arr);
		
}
	
	public static  void minimumTillIthPoint(int[] arr) {
		int n = arr.length;
		int[] res = new int[n];
		for(int i=0;i<n;i++) {
			
			while(!stack.isEmpty()&& arr[i] <stack.peek()) {
				stack.pop();
			}
			if(stack.isEmpty())
				stack.push(arr[i]);
			res[i] = stack.peek();
		}

	System.out.println(Arrays.toString(res));

	}
}

