package Easy;

public class Range_Sum_of_BST {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public static int rangeSumBST(TreeNode root, int low, int high) {
		return preorder(root, low, high);
	}

	public static int preorder(TreeNode root, int low, int high) {
		int sum = 0;
		if (root == null) {
			return 0;
		}
		if (root.val <= high && root.val >= low) {
			sum = sum + root.val;
		}
		sum += preorder(root.left, low, high);
		sum += preorder(root.right, low, high);
		return sum;
	}

}
