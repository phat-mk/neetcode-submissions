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
    private List<Integer> listVal = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        DFS(root);
        Collections.sort(listVal);
        return listVal.get(k-1);
    }

    public void DFS(TreeNode root) {
        if (root == null) return;
        listVal.add(root.val);
        DFS(root.left);
        DFS(root.right);
    }
}
