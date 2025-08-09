class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int newArr[] = new int[nums1.length + nums2.length];
        int p1 = 0, p2 = 0, i=0;

        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] <= nums2[p2]) {
                newArr[i] = nums1[p1];
                i++;
                p1++;
            }
            else{
                newArr[i] = nums2[p2];
                i++;
                p2++;
            }
        }

        while(p1 < nums1.length){
            newArr[i++] = nums1[p1++];
        }

        while(p2 < nums2.length) {
            newArr[i++] = nums2[p2++];
        }

        int n = newArr.length;

        if(n%2 == 0){
            double num1 = newArr[n/2];
            double num2 = newArr[n/2 - 1];

            return (num1+num2)/2;
        }

        double num = newArr[n/2];

        return num;
        
    }
}