class Solution {
    public int removeDuplicates(int[] nums) {

        // HashSet<Integer> removeDupe = new HashSet<>();

        // for(int i=0; i<nums.length; i++) {
        //     removeDupe.add(nums[i]);
        // }

        // int index = 0;

        // for(int val : removeDupe) {
        //     nums[index] = val;
        //     index++;
        // }

        // return index;

        int index = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }

        }

        return index;
        
    }
}