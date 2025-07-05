class Solution {
    public int findLucky(int[] arr) {
        
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int result = -1;

        for(int num : freq.keySet()) {
            if(num == freq.get(num) ) {
                result = Math.max(result, num);
            }
        }

        return result;

    }
}