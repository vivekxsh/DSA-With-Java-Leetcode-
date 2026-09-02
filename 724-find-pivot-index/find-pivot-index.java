class Solution {
    public int pivotIndex(int[] nums) {

        // for(int i=0; i<nums.length; i++) {
        //     int leftSum = 0;
        //     for(int j=0; j<i; j++) {
        //         leftSum += nums[j];
        //     }

        //     int rightSum = 0;
        //     for(int j=i+1; j<nums.length; j++) {
        //         rightSum += nums[j];
        //     }

        //     if(leftSum == rightSum){
        //         return i;
        //     }


        // }

        // return -1;


        int prefix = 0;
        int total = 0;

        for(int ele : nums) {
            total += ele;
        }

        for(int pivot=0; pivot<nums.length; pivot++) {
            int suffix = total - prefix - nums[pivot];

            if(suffix == prefix) {
                return pivot;
            }

            prefix += nums[pivot];
        }

        return -1;
        
    }
}