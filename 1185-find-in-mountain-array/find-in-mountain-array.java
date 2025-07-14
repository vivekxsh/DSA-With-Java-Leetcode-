/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndex(mountainArr);
        int index = binarySearch(mountainArr, target, 0, peak);

        if(index != -1) {
            return index;
        }

        return binarySearch(mountainArr, target, peak+1, mountainArr.length()-1);
        
    }

    private int peakIndex(MountainArray mountainArr) {

        int left = 0;
        int right = mountainArr.length()-1;

        while(left < right) {
            int mid = left + (right - left)/2;

            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
                right = mid;
            }
            else{
                left = mid+1;
            }
        }

        return left;

    }


    public int binarySearch(MountainArray mountainArr, int target, int left, int right) {

        boolean isAsending =  mountainArr.get(left) < mountainArr.get(right);

        while(left <= right) {

            int mid = left + (right-left)/2;

            if(mountainArr.get(mid) == target) {
                return mid;
            }

            if(isAsending) {
                if(target > mountainArr.get(mid)) {
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            
            else {
                if(target > mountainArr.get(mid)) {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }


        }

        return -1;

    }


}