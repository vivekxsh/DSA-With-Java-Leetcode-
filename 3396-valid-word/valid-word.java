class Solution {
    public boolean isValid(String word) {
        
        if(word.length() < 3) {
            return false;
        }

        int v = 0, c = 0;

        // boolean ans = false;
        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);

            if(Character.isDigit(ch)) {
                continue;
            }

            if(Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
                if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    ch = Character.toLowerCase(ch);
                    if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                        v++;
                    }

                    else if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                        c++;
                    }
                }
            }

            else if(!Character.isLetter(ch)) {
                return false;
            }
        }

        if(v == 0 || c == 0) {
            return false;
        }

        return true;

    }
}