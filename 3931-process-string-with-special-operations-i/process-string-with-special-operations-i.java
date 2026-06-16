class Solution {
    public String processStr(String s) {

        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != '*' && ch != '#' && ch != '%') {
                result.append(ch);
            }

            else if(ch == '*') {
                if(result.length() > 0) {
                    result.deleteCharAt(result.length()-1);
                }
            }
            else if(ch == '#') {
                result.append(result.toString());
            }
            else{
                result.reverse();
            }
        }

        return result.toString();
        
    }
}