/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int lvl = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();   // Corrected line

                if (lvl % 2 == 0) {
                    l.add(curr.val);
                } else {
                    l.add(0, curr.val);
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            list.add(l);
            lvl++;
        }

        return list;
    }
}