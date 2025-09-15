class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        int canType = 0;
        String textArr[] = text.split(" ");

        for(int i=0; i<textArr.length; i++) {
            String currText = textArr[i];
            
            if(helper(currText, brokenLetters)) {
                canType++;
            }

        }

        return canType;
        
    }

    boolean helper(String currText, String brokenLetters) {
        int j = 0;
        while(j < brokenLetters.length()) {
            if(currText.indexOf(brokenLetters.charAt(j)) != -1) {
                return false;
            }
            j++;
        }

        return true;
    }
}