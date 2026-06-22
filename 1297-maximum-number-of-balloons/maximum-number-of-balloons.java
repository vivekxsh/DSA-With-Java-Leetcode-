class Solution {
    public int maxNumberOfBalloons(String text) {

        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == 'b') {
                b++;
            }else if(ch == 'a') {
                a++;
            }else if(ch == 'l') {
                l++;
            }else if(ch == 'o') {
                o++;
            }else if(ch == 'n') {
                n++;
            }else{
                continue;
            }
        }

        int l1 = l/2;
        int o1 = o/2;

        int min = Math.min(b, Math.min(a, Math.min(l1, Math.min(o1, n))));

        return min;
        
    }
}