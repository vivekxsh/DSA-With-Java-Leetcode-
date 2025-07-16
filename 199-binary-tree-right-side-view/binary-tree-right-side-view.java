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

    public void backtrack(ArrayList<Integer> al, TreeNode root, int level) {

        if(root == null) {
            return;
        }

        // base case
        if(level == al.size()) {
            al.add(root.val);
        }

        backtrack(al, root.right, level+1);
        backtrack(al, root.left, level+1);

    }

    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList<Integer> al = new ArrayList<>();
        backtrack(al, root, 0);

        return al;

    }
}