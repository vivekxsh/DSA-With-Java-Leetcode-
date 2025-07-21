class Solution {
    public String makeFancyString(String s) {

        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()) {

            int len = res.length();
            if(len >= 2 && res.charAt(len-1) == ch && res.charAt(len-2) == ch) {
                continue;
            }
            res.append(ch);
        }

        return res.toString();
        
    }
}