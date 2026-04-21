/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 1. Base case: If the node is null, no path exists
        if (root == null) {
            return false;
        }

        // 2. Check if we are at a leaf node
        if (root.left == null && root.right == null) {
            // A path is valid only if the remaining targetSum matches the leaf value
            return targetSum == root.val;
        }

        // 3. Recurse down to children, subtracting current value from targetSum
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}