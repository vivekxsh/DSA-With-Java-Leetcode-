class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;
        int n = nums1.length, m = nums2.length;

        Set<Integer> temp = new HashSet<>();

        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else{
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[temp.size()];
        int index = 0;

        for(int ele : temp) {
            ans[index++] = ele;
        }

        return ans;
        
    }
}