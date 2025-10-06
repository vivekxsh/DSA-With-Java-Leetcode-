// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int ans[] = new int[m+n];
//         int k=0,i=0,j=0;

//         while(i < m && j<n){
//             if(nums1[i] < nums2[j]){
//                 ans[k] = nums1[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 ans[k] = nums2[j];
//                 j++;
//                 k++;
//             }
//         }

//         while(i<m){
//             ans[k++] = nums1[i++];
//         }

//         while(j<n){
//             ans[k++] = nums2[j++];
//         }

//         for(int s=0; s<m+n; s++){
//             nums1[s] = ans[s];
//         }




//     }
// }



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1 (actual elements), nums2, and the writing position in nums1
        int p1 = m - 1;          // Pointer for the last element in the significant part of nums1
        int p2 = n - 1;          // Pointer for the last element in nums2
        int writePtr = m + n - 1; // Pointer for the last available position in nums1

        // While there are elements to compare in both arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[writePtr] = nums1[p1];
                p1--;
            } else {
                nums1[writePtr] = nums2[p2];
                p2--;
            }
            writePtr--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        // (elements in nums1 before p1 are already in place and sorted,
        // so we only need to handle remaining nums2 elements if any)
        while (p2 >= 0) {
            nums1[writePtr] = nums2[p2];
            p2--;
            writePtr--;
        }
    }
}