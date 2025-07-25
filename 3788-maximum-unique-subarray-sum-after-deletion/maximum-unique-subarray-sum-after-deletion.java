class Solution {
    public int maxSum(int[] nums) {

        // Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        int maxValue = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > maxValue) {
                maxValue = nums[i];
            }
            set.add(nums[i]);
        }

        int sum = 0;
        for(int num : set) {
            if(num > 0) {
                sum += num;
            }
            else {
                continue;
            }
        }

        return sum==0 ? maxValue : sum;
        
    }
}