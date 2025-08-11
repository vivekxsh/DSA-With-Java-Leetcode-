class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] sCharArray = s.toCharArray();

        Arrays.sort(sCharArray);

        char[] tCharArray = t.toCharArray();

        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
        
    }
}