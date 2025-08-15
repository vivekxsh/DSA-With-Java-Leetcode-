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
    public long kthLargestLevelSum(TreeNode root, int k) {

        if(root == null) {
            return -1;
        }

        ArrayList<Long> arr = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);

        long sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            TreeNode current = queue.remove();

            if(current == null) {
                arr.add(sum);
                // pq.offer((int)sum);
                // while(pq.size() > k) {
                //     pq.poll();
                // }

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

        if(k > arr.size()) {
            return -1;
        }

        arr.sort(Collections.reverseOrder());
        return arr.get(k-1);

        // return pq.poll();
        
    }
}