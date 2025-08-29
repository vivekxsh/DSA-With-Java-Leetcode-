class Solution {
    public void moveZeroes(int[] nums) {

        int zeros = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
        }

        int idx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[idx++] = nums[i];
            }
            else{
                continue;
            }
        }

        for(int i=0; i<zeros; i++) {
            nums[idx++] = 0;
        }
        
    }
}