package DSA_Hot_Qns;
import java.util.Arrays;
import java.util.Stack;

public class PreviousNextSmallerGreater {

	public static void main(String[] args) {
		
		int[] arr = new int[] {12,11,10,3,2,1,5,3,20,13};
		
		System.out.println("*****nextGreater*****");
		nextGreater(arr);
		System.out.println("*****nextSmaller*****");
		nextSmaller(arr);
		System.out.println("*****previousGreater*****");
		previousGreater(arr);
		System.out.println("*****previousSmaller*****");
		previousSmaller(arr);
	}
	
	
	public static void nextGreater(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack();
		
		Arrays.fill(res,Integer.MAX_VALUE);
		
		
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
				res[stack.pop()]=arr[i];
			stack.push(i);
		}

		System.out.println(Arrays.toString(res));
	}
	
	
	
	public static void nextSmaller(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack();
		Arrays.fill(res,Integer.MIN_VALUE);
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
				res[stack.pop()]=arr[i];
			stack.push(i);
		}

		System.out.println(Arrays.toString(res));
		}
	
	
	
	public static void previousGreater(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack();
		
		Arrays.fill(res,Integer.MAX_VALUE);
		
		
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
				res[stack.pop()]=arr[i];
			stack.push(i);
		}

		System.out.println(Arrays.toString(res));
	}
	
	
	
	
	public static void previousSmaller(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack();
		
		Arrays.fill(res,Integer.MIN_VALUE);
		
		
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
				res[stack.pop()]=arr[i];
			stack.push(i);
		}

		System.out.println(Arrays.toString(res));
	}
	

}
