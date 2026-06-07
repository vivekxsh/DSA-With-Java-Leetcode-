class Solution {
    public int distributeCandies(int[] candyType) {

        int n = candyType.length;
        int limit = n / 2;

        HashSet<Integer> unique = new HashSet<>();

        for(int num : candyType) {
            unique.add(num);
        }

        return Math.min(limit, unique.size());
        
    }
}