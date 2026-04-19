class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maximumOnes = 0;
        int counter = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                counter++;
            }
            else if(nums[i] == 0){
                counter = 0;
            }
            maximumOnes = Math.max(maximumOnes, counter);
        }

        return maximumOnes;
        
    }
}