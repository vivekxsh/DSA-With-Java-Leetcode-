class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        // if(nums == null || nums.length == 0) {
        //     return 0;
        // }

        // int sum = 0;

        // HashSet<Integer> set = new HashSet<>();

        // int left = 0;

        // for(int right = 0; right < nums.length; right++) {

        //     while(set.contains(nums[right])) {
        //         set.remove(nums[left]);
        //         left++;
        //     }

        //     set.add(nums[right]);

        //     int tempSum = 0;
        //     for(int i = left; i<=right; i++) {
        //         tempSum += nums[i];
        //     }

        //     sum = Math.max(tempSum, sum);
        // }

        // return sum;



        int n = nums.length;

        boolean isSeen[] = new boolean[10001];
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;

        for(int right = 0; right < n; right++) {

            while(isSeen[nums[right]]) {
                currentSum -= nums[left];
                isSeen[nums[left]] = false;
                left++;
            }

            currentSum += nums[right];
            isSeen[nums[right]] = true;
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;

        
    }
}