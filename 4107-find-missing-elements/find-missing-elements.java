class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        int minimum = nums[0];
        int maximum = nums[n-1];

        for(int i = minimum; i <= maximum; i++) {
            ans.add(i);
        }

        for(int i=0; i<n; i++) {
            if(ans.contains(nums[i])) {
                ans.remove(Integer.valueOf(nums[i]));
            }
        }

        return ans;

        
    }
}