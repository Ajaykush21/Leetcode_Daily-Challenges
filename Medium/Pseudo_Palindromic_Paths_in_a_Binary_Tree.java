package Medium;

import java.util.*;

public class Pseudo_Palindromic_Paths_in_a_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	static int res = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pseudoPalindromicPaths (root);
	}

	public int pseudoPalindromicPaths(TreeNode root) {
		dfs(root, 0);
		return res;
	}

	public void dfs(TreeNode root, int bit) {
		if (root == null)
			return;

		bit = bit ^ (1 << root.val);
		if (root.left == null && root.right == null && isValid(bit))
			res++;
		dfs(root.left, bit);
		dfs(root.right, bit);
	}

	public boolean isValid(int bit) {
		int c = 0;
		while (bit > 0) {
			if ((bit & 1) == 1)
				c++;
			bit = bit >> 1;
		}
		if (c >= 2)
			return false;
		return true;

	}

}
