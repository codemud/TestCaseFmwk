package assignments.questions.trees.binary.CheckBalanced;

import util.other.binaryTreeUtil.BinaryTreeNode;

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	public static class CheckBalancedReturnType{
		boolean isBalanced;
		int height;
	}
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		if(root == null){
			return true;
		}
		return checkBalancedHelper(root).isBalanced;
	}

	public static CheckBalancedReturnType checkBalancedHelper(BinaryTreeNode<Integer> root){
		if(root == null){
			CheckBalancedReturnType ans = new CheckBalancedReturnType();
			ans.height = 0;
			ans.isBalanced = true;
			return ans;
		}

		CheckBalancedReturnType leftAns = checkBalancedHelper(root.left);
		CheckBalancedReturnType rightAns = checkBalancedHelper(root.right);

		int heightDiff = leftAns.height > rightAns.height ? (leftAns.height - rightAns.height) : (rightAns.height - leftAns.height);

		CheckBalancedReturnType ans;
		if(!leftAns.isBalanced || !rightAns.isBalanced || heightDiff > 1){
			ans  = new CheckBalancedReturnType();
			ans.height = Math.max(leftAns.height, rightAns.height) + 1;
			ans.isBalanced = false;
		}else{
			ans = new CheckBalancedReturnType();
			ans.height = Math.max(leftAns.height, rightAns.height) + 1;
			ans.isBalanced = true;
		}
		return ans;

	}
	
}
