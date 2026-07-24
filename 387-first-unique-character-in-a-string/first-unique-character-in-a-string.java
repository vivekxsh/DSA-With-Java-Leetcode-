class Solution {
    public int firstUniqChar(String s) {

        int n = s.length();


        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(char ch : s.toCharArray()) {
            if(map.get(ch) == 1) {
                return s.indexOf(ch);
            }
        }

        return -1;
        
    }
}