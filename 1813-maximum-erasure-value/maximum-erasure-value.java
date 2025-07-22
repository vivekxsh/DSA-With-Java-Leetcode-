class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;

        HashSet<Integer> set = new HashSet<>();

        int left = 0;

        for(int right = 0; right < nums.length; right++) {

            while(set.contains(nums[right])) {
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[right]);

            int tempSum = 0;
            for(int i = left; i<=right; i++) {
                tempSum += nums[i];
            }

            sum = Math.max(tempSum, sum);
        }

        return sum;

        
    }
}