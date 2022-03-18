package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.List;

public class PrintKSumPaths {

	 static class Node {
	        int data;
	        Node left, right;
	        Node(int x)
	        {
	            data = x;
	            left = right = null;
	        }
	    };
	    
	    
	public static void main(String[] args) {
		Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);
 
        int k = 5;
        
        List<Integer> list = new ArrayList();
        List<List<Integer>> result  =new ArrayList();
        PrintKPaths(root,k,list,result);
        System.out.println(result);

	}
	
	private static void printPaths(int i, List<Integer> list, List<List<Integer>> result) {
		List<Integer> arr = new ArrayList();
		for(int j=i;j<list.size();j++)
			arr.add(list.get(j));
		result.add(arr);
		
	}
	private static void PrintKPaths(Node root,int k, List<Integer> list, List<List<Integer>> result) {
		
		if(root==null)
			return ;
		
		list.add(root.data);
		
		PrintKPaths(root.left,k, list,result);
		PrintKPaths(root.right,k,list,result);
		
		int sum =0;
		for(int i=list.size()-1;i>=0;i--) {
			sum+=list.get(i);
			if(sum==k) {
				printPaths(i,list,result);
			}
		}
		
		list.remove(list.size()-1);
	}

}
