class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0, ones = 0, twos = 0;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
            else if(nums[i] == 1) {
                ones++;
            }
            else{
                twos++;
            }
        }

        int index = 0;
        for(int i=0; i<zeros; i++) {
            nums[index++] = 0;
        }
        for(int i=0; i<ones; i++) {
            nums[index++] = 1;
        }
        for(int i=0; i<twos; i++) {
            nums[index++] = 2;
        }
        
    }
}