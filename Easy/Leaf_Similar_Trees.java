package Easy;

public class Leaf_Similar_Trees {
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

	private String leafSequence(TreeNode root) {
		String s = "";
		if (root != null) {
			s += leafSequence(root.left);
			s += leafSequence(root.right);
			if (root.left == null && root.right == null) {
				s += Integer.toString(root.val) + ".";
			}
		}
		return s;
	}

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		String s1 = leafSequence(root1);
		String s2 = leafSequence(root2);
		return s1.equals(s2);
	}

}
