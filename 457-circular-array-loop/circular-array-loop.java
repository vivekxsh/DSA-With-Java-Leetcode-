class Solution {
    public boolean circularArrayLoop(int[] nums) {

        int n = nums.length;

        for(int i=0; i<n; i++) {

            boolean positive = nums[i] > 0;

            int slow = i;
            int fast = i;

            while (true) {
                slow = nextIndex(slow, nums);

                if(( nums[slow] > 0 ) != positive) {
                    break;
                }

                fast = nextIndex(fast, nums);
                if(( nums[fast] > 0 ) != positive) {
                    break;
                }

                fast = nextIndex(fast, nums);
                if(( nums[fast] > 0 ) != positive) {
                    break;
                }


                if(slow == fast) {
                    if(slow == nextIndex(slow, nums)) {
                        break;
                    }
                    return true;
                }
            }
        }

        return false;
        
    }

    private int nextIndex(int index, int[] nums) {
        int n = nums.length;

        return ((index+nums[index]) % n + n) % n;
    }
}