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

    boolean helper(TreeNode root, int data) {
        if(root == null){
            return true;
        }

        if(root.val != data) {
            return false;
        }

        return helper(root.left, data) && helper(root.right, data);
    }

    public boolean isUnivalTree(TreeNode root) {

        if(root == null) {
            return true;
        }

        return helper(root, root.val);
        
    }
}