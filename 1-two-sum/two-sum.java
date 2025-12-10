class Solution {
    public int[] twoSum(int[] nums, int target) {

        int startIdx = -1;
        int endIdx = -1;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    startIdx = i;
                    endIdx = j;
                }
            }
        }

        return new int[]{startIdx, endIdx};
        
    }
}