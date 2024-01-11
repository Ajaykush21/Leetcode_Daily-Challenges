package Medium;

public class Maximum_Difference_Between_Node_and_Ancestor {
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
	 public int maxAncestorDiff(TreeNode root) {
         if(root==null) return 0;
       return helper(root, root.val, root.val);
   }
    public int helper(TreeNode root, int minVal, int maxVal){
       if(root==null) return maxVal-minVal;
       minVal = Math.min(minVal, root.val);
       maxVal = Math.max(maxVal, root.val);

       int left = helper(root.left, minVal, maxVal);
       int right = helper(root.right, minVal, maxVal);
       return Math.max(left, right);
   }

}
