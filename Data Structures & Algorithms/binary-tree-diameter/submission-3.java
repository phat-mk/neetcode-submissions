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
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDepth(root);
        return max;
    }

    public int findDepth(TreeNode root) {
        if (root == null) return 0;

        int maxLeft = findDepth(root.left);
        int maxRight = findDepth(root.right);

        max = Math.max(max, maxLeft + maxRight);

        return Math.max(maxLeft, maxRight) + 1;
    }
}
