class Solution {
    public int maxSubArray(int[] nums) {

        int finalSum = nums[0];
        int currSum = nums[0];

        for(int i=1; i<nums.length; i++) {

            currSum = Math.max(currSum+nums[i], nums[i]);

            finalSum = Math.max(finalSum, currSum);
        }

        return finalSum;
        
    }
}