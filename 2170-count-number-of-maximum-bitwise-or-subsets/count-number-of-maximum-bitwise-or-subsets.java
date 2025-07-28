class Solution {
    public int countMaxOrSubsets(int[] nums) {

        int maxOr = 0;

        for(int i=0; i<nums.length; i++) {
            maxOr = maxOr | nums[i];
        }

        return helper(nums, maxOr, 0, 0);

        
    }

    public int helper(int[] nums, int target, int idx, int temp) {

        if(idx == nums.length) {
            return target==temp ? 1 : 0;
        }


        int include = helper(nums, target, idx + 1, temp | nums[idx]);
        int exclude = helper(nums, target, idx+1, temp);

        return include+exclude;

    }
}