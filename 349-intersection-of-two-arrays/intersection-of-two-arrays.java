class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;

        for(int i=0; i<n1; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> ans = new HashSet<>();

        for(int i=0; i<n2; i++) {
            if(set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }

        int[] finalAns = new int[ans.size()];

        int i = 0;
        for(int ele : ans) {
            finalAns[i++] = ele;
        }

        return finalAns;
        
    }
}