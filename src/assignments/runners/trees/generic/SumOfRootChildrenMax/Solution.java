package assignments.runners.trees.generic.SumOfRootChildrenMax;


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
	
	static class MaxNodePair<T>{
		TreeNode<T> node;
		int sum;
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		return maxSumNodeHelper(root).node;
	}
	
	public static MaxNodePair<Integer> maxSumNodeHelper(TreeNode<Integer> root){
		if(root == null){
			MaxNodePair<Integer> pair = new MaxNodePair<>();
			pair.node = null;
			pair.sum = Integer.MIN_VALUE;
			return pair;
		}
		int sum =root.data;
		for(TreeNode<Integer> child : root.children){
			sum+= child.data;
		}
		MaxNodePair<Integer> ans = new MaxNodePair<>();
		ans.node = root;
		ans.sum = sum;
		for(TreeNode<Integer> child : root.children){
			MaxNodePair<Integer> childAns = maxSumNodeHelper(child);
			if(childAns.sum > ans.sum){
				ans = childAns;
			}
		}
		return ans;
	}
	
}
