class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;

        if(nums[0] != 0){
            return 0;
        }

        int naturalSum = (n*(n+1))/2;
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum = sum + nums[i];
        }

        int diff = naturalSum-sum;

        return diff == 0 ? nums.length+1 : diff;

    }
}