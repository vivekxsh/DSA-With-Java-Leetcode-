class Solution {
    public int maxSum(int[] nums) {

        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
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

        return sum==0 ? nums[nums.length-1] : sum;
        
    }
}