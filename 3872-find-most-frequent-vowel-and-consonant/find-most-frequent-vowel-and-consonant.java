class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) {
                vowel.put(ch, vowel.getOrDefault(ch, 0) + 1);
            }

            else{
                consonant.put(ch, consonant.getOrDefault(ch, 0) + 1);
            }

        }

        int vowelMaxFrequency = 0;
        int consonantMaxFrequency = 0;

        for(Map.Entry<Character, Integer> entry : vowel.entrySet()) {
            if(entry.getValue() > vowelMaxFrequency) {
                vowelMaxFrequency = entry.getValue();
            }
        }

        for(Map.Entry<Character, Integer> entry : consonant.entrySet()) {
            if(entry.getValue() > consonantMaxFrequency) {
                consonantMaxFrequency = entry.getValue();
            }
        }

        return (vowelMaxFrequency + consonantMaxFrequency);
        
    }
}