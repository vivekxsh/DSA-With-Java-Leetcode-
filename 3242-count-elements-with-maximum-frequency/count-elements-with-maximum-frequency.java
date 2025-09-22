class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue() > max) {
                max = entry.getValue();
            }

        }

        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue() == max) {
                count += entry.getValue();
            }
        }

        return count;
        
    }
}