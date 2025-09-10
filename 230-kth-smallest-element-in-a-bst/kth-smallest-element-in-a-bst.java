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

    public void inorder(TreeNode root, ArrayList<Integer> nodes){
        if(root == null){
            return;
        }
        inorder(root.left, nodes);
        nodes.add(root.val);
        inorder(root.right, nodes);
    }



    public int kthSmallest(TreeNode root, int k) {

        ArrayList<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for(int i=0; i<nodes.size(); i++) {
            pq.offer(nodes.get(i));

            while(pq.size() > k) {
                pq.remove();
            }

        }

        return pq.peek();

        
    }
}