package assignments.runners.trees.generic.NextLargerElement;


public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		if(root == null){
			return null;
		}
			
		TreeNode<Integer> nextLargerNode = null;
		if(root.data > n){
			nextLargerNode = root;
		}
		
		for(TreeNode<Integer> child : root.children){
			TreeNode<Integer> nextLargerInChild = findNextLargerNode(child, n);
			if(nextLargerInChild != null ){
				if(nextLargerNode == null || nextLargerNode.data > nextLargerInChild.data){
					nextLargerNode = nextLargerInChild;
				}
			}
		}
		return nextLargerNode;
	}
	
}
