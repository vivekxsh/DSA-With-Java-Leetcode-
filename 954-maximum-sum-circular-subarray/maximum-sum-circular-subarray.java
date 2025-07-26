class Solution {
    public int maxSubarraySumCircular(int[] nums) {


        int maxSum = nums[0];
        int minSum = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        int total = nums[0];

        for(int i=1; i<nums.length; i++) {

            currMax = Math.max(currMax+nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin+nums[i], nums[i]);
            minSum = Math.min(minSum, currMin);

            total += nums[i];

        }

        if(maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total-minSum);
        
    }
}