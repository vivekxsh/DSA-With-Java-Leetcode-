class Solution {
    public int missingMultiple(int[] nums, int k) {

        int dummy[] = new int[1001];

        for(int i=0; i<nums.length; i++) {
            int number = nums[i];
            dummy[number] = 1;
        } 

        for(int i=k; i<1001; i++) {
            if(dummy[i] == 0 && i % k == 0) {
                return i;
            }
        }

        return -1;
        
    }
}