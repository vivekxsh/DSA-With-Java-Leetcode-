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
    public int maxLevelSum(TreeNode root) {
        
        if(root == null) {
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        int sum = 0;

        while(!queue.isEmpty()) {
            TreeNode current = queue.remove();

            if(current == null) {
                arr.add(sum);
                sum = 0;
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }

            else{
                sum += current.val;

                if(current.left != null) {
                    queue.add(current.left);
                }

                if(current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) > max){
                max = arr.get(i);
                ans = i;
            }
        }

        return ans+1;

    }
}