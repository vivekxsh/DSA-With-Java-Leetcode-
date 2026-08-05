class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            int remaining = target-nums[i];

            if(map.containsKey(remaining)) {
                int index0 = map.get(remaining);
                int index1 = i;

                return new int[]{index0, index1};
            }

            map.put(nums[i], i);
        }

        return new int[]{0,0};
       
    }
}