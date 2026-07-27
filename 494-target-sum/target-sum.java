class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0 ,0);
    }
    private int helper(int[] nums, int target, int idx, int sum) {
        if(idx >= nums.length) {
            return sum == target ? 1 : 0;
        }

        int subtract = helper(nums, target, idx+1, sum-nums[idx]);
        int add = helper(nums, target, idx+1, sum+nums[idx]);

        return subtract + add;
    }
}