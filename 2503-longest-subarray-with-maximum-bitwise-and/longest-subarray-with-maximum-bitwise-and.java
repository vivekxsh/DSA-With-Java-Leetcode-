class Solution {
    public int longestSubarray(int[] nums) {

        int len = 1;

        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            max = Math.max(max, num);
        }

        int temp_len = 0;

        for(int num : nums) {
            if(num == max) {
                temp_len++;
            }
            else{
                len = Math.max(len, temp_len);
                temp_len = 0;
            }
        }


        return Math.max(len, temp_len);
        
    }
}