class Solution {
    public int search(int[] nums, int target) {
        
        return rotated(nums, target, 0, nums.length-1);

    }

    public static int rotated(int arr[], int target, int si, int ei) {
        // base case
        if(si > ei) {
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == target) {
            return mid;
        }

        // target on L1
        if(arr[si] <= arr[mid]) {
            // case a : left
            if(target >= arr[si] && target <= arr[mid]) {
                return rotated(arr, target, si, mid-1);
            }
            // case b: right
            else{
                return rotated(arr, target, mid+1, ei);
            }
        }

        // taget on L2
        else{
            // case c: right
            if(target >= arr[mid] && target <= arr[ei]) {
                return rotated(arr, target, mid+1, ei);
            }

            // case d: left
            else{
                return rotated(arr, target, si, mid-1);
            }
        }
    }
}