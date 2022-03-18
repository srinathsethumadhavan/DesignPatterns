package DSA_Hot_Qns;

public class LargestSubTreeSum {

	static class Node
	{
	    int key;
	    Node left;
	    Node right;
	    Node(int key){
	    	this.key = key;
	    }
	}
	 

	public static void main(String[] args) {
		 /*
        1
        / \
        /     \
    -2     3
    / \     / \
    / \ / \
    4     5 -6     2
*/

Node root = new Node(1);
root.left = new Node(-2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
root.right.left = new Node(-6);
root.right.right = new Node(2);

findLargestSubtreeSum(root);

System.out.println(result);
}

	static int result =Integer.MIN_VALUE;
private static int findLargestSubtreeSum(Node root) {
	
	if(root==null)
		return 0;
	int leftsum = findLargestSubtreeSum(root.left);
	int rightsum = findLargestSubtreeSum(root.right);
	
	int subtreesum = root.key+leftsum+rightsum;
	
	result = Math.max(subtreesum, result);
	return subtreesum;
}

}
