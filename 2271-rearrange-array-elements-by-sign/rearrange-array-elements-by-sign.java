class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                negative.add(nums[i]);
            }
            else{
                positive.add(nums[i]);
            }
        }

        int i=0, j=0;
        int idx = 0;

        while(i < positive.size() && j < negative.size()) {
            nums[idx++] = positive.get(i++);
            nums[idx++] = negative.get(j++);
        }

        while(i < positive.size()) {
            nums[idx++] = positive.get(i++);
        }

        while(j < negative.size()) {
            nums[idx++] = negative.get(j++);
        }

        return nums;
        
    }
}