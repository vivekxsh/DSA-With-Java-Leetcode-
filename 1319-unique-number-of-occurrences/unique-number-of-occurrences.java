class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            set1.add(arr[i]);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            set2.add(entry.getValue());
        }

        return set1.size() == set2.size();
        
    }
}