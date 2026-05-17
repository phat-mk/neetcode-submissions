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
    private int totalGoodNodes = 0;
    public int goodNodes(TreeNode root) {
        DFS(root, root.val);
        return totalGoodNodes;
    }

    public void DFS(TreeNode root, int max) {
        if (root == null) return;
        if (root.val >= max) totalGoodNodes++;
        max = Math.max(max, root.val);
        DFS(root.left, max);
        DFS(root.right, max);
    }
}
