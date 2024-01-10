package Medium;

public class Amount_of_Time_for_Binary_Tree_to_Be_Infected {
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

	public int maxDistance;

	public int amountOfTime(TreeNode root, int start) {
		int temp = helper(root, start);
		return maxDistance;
	}

	public int helper(TreeNode root, int start) {
		if (root == null)
			return 0;
		int left = helper(root.left, start);
		int right = helper(root.right, start);

		int depth = 0;
		if (root.val == start) {
			maxDistance = Math.max(left, right);
			depth = -1;
		} else if (left >= 0 && right >= 0) {
			depth = Math.max(left, right) + 1;
		} else {
			int distance = Math.abs(left) + Math.abs(right);
			maxDistance = Math.max(maxDistance, distance);
			depth = Math.min(left, right) - 1;
		}
		return depth;
	}

}
