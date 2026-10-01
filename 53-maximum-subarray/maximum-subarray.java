class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int maxSum = nums[0];

        int currSum = nums[0];

        for(int i=1; i<n; i++) {
            currSum = Math.max(currSum+nums[i], nums[i]);

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
        
    }
}