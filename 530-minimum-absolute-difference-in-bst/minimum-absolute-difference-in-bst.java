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

    private int min = Integer.MAX_VALUE;
    private int prev = -1;

    void findRoot(TreeNode root) {

        if(root == null){
            return;
        }

        findRoot(root.left);
        if(prev >= 0 && min > root.val-prev) {
            min = root.val - prev;
        }

        prev = root.val;
        findRoot(root.right);
    }

    public int getMinimumDifference(TreeNode root) {

        findRoot(root);
        return min;
        
    }
}