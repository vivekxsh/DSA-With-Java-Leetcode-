class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int start = 0;
        for(int i=0; i<nums.length; i++) {
            if(start != nums[i]) {
                return start;
            }
            start++;
        }

        return nums[nums.length-1]+1;
        
    }
}