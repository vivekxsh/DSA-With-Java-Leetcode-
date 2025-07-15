class Solution {
    public boolean isValid(String word) {
        
        if(word.length() < 3) {
            return false;
        }

        int vowel = 0, consonant = 0;

        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);

            if(Character.isDigit(ch)) {
                continue;
            }

            if(Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
                if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    ch = Character.toLowerCase(ch);
                    if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                        vowel++;
                    }

                    else if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                        consonant++;
                    }
                }
            }

            else if(!Character.isLetter(ch)) {
                return false;
            }
        }

        if(vowel == 0 || consonant == 0) {
            return false;
        }

        return true;

    }
}