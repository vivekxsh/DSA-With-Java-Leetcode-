class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i=0; i<nums.length; i++) {
            treeSet.add(nums[i]);

            if(treeSet.size() > 3) {
                treeSet.pollFirst();
            }
        }


        return (treeSet.size() == 3) ? treeSet.first() : treeSet.last();
        
    }
}