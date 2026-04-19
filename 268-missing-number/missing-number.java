class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int missing = -1;
        int start = 0;

        for(int i=0; i<nums.length; i++) {
            if(start != nums[i]) {
                missing = start;
                break;
            }
            start++;
        }

        if(start == -1) {
            return nums[nums.length-1] + 1;
        }

        return start;
        
    }
}