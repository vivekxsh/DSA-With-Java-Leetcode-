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

    void travelPath(TreeNode root, String path, List<String> list){
        if(root==null){
            return;
        }

        path = path+root.val;
        if(root.left == null && root.right == null) {
            list.add(new String(path));
        }

        path = path+"->";
        travelPath(root.left, path, list);
        travelPath(root.right, path, list);

        path.substring(path.length());
    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> path = new ArrayList<>();
        travelPath(root, "", path);

        return path;
        
    }
}