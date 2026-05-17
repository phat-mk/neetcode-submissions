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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode firstTree, TreeNode secondTree) {
        if (firstTree == null && secondTree == null) return true;
        if (firstTree == null || secondTree == null) return false;
        if (firstTree.val != secondTree.val) return false;

        return isSameTree(firstTree.left, secondTree.left) && isSameTree(firstTree.right, secondTree.right);
    }
}
