class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            arr.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            arr.add(nums2[i]);
        }

        Collections.sort(arr);

        int n = arr.size();

        if(n%2 == 0){
            double num1 = arr.get(n/2);
            double num2 = arr.get(n/2 - 1);

            return (num1+num2)/2;
        }

        double num = arr.get(n/2);

        return num;
        
    }
}