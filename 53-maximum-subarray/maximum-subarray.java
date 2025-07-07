class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxEnding = 0;
        int result = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {

            maxEnding = maxEnding + nums[i];

            result = Math.max(maxEnding, result);

            if(maxEnding < 0) {
                maxEnding = 0;
            }

        }

        

        return result;

    }
}