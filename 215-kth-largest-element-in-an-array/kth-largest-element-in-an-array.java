class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);

        for(int i=0; i<nums.length; i++) {
            pq.offer(nums[i]);

            while(pq.size() > k) {
                pq.remove();
            }
        }

        return pq.peek();
        
    }
}