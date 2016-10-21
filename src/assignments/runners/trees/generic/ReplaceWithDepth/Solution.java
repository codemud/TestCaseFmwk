package assignments.runners.trees.generic.ReplaceWithDepth;

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
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){
		if(root == null){
			return;
		}
		 replaceWithDepthValue(root,0);
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root, int depth){
		root.data = depth;
		for(TreeNode<Integer> child : root.children){
			replaceWithDepthValue(child, depth + 1);
		}	
	}
	
}
