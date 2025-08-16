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

    static class Info{
        int diam;
        int ht;
        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    Info nodeInfo(TreeNode root){

        if(root == null){
            return new Info(0,0);
        }

        Info ldiam = nodeInfo(root.left);
        Info rdiam = nodeInfo(root.right);

        int diam = Math.max(Math.max(ldiam.diam, rdiam.diam), ldiam.ht+rdiam.ht);
        int ht = Math.max(ldiam.ht, rdiam.ht) +1;

        return new Info(diam, ht);
    }

    public int diameterOfBinaryTree(TreeNode root) {

        // if(root == null) {
        //     return 0;
        // }

        // int ldiam = diameterOfBinaryTree(root.left);
        // int rdiam = diameterOfBinaryTree(root.right);

        // int lh = height(root.left);
        // int rh = height(root.right);

        // return Math.max(lh+rh, Math.max(ldiam, rdiam));


        // optimized
        return nodeInfo(root).diam;
        
    }

    int height(TreeNode root){
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }
}