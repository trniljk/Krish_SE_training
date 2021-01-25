package javafundamentals.searching;

public class BinarySearchTree {
	
	Node sortedArrayToBST(int [] array,int start, int end) {
		if(start>end) {
			return null;
		}
		
		int mid = (start+end)/2;
		Node node = new Node(array[mid]);
		
		node.left = sortedArrayToBST(array, start, mid-1);
		node.right = sortedArrayToBST(array, mid+1, end);
			
		return node;
	}
	void printTree(Node node) {
		if(node==null)
			return;
		System.out.println(node.data+" ");
		printTree(node.left);
		printTree(node.right);
	}
//			[2, 3, 4, 5, 6, 54, 89]
//			[2, 3, 4, 5, 6, 54, 89]
//			[2, 3, 4, 5, 6, 54, 89]
//			Sorted Array :: [2, 3, 4, 5, 6, 54, 89]
//			5 
//			3 
//			2 
//			4 
//			54 
//			6 
//			89 	

}
