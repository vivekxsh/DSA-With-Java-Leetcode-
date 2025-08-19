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

    public void inOrder(TreeNode root, TreeSet<Integer> set) {

        if(root == null) {
            return;
        }

        set.add(root.val);
        inOrder(root.left, set);
        inOrder(root.right, set);
    }

    public int findSecondMinimumValue(TreeNode root) {

        TreeSet<Integer> set = new TreeSet<>();

        inOrder(root, set);

        if(set.size() <= 1){
            return -1;
        }

        Iterator<Integer> it = set.iterator();
        it.next();

        return it.next();
        
    }
}