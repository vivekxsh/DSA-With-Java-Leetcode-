class Solution {
    public String restoreString(String s, int[] indices) {

        char shuffle[] = new char[indices.length];

        for(int i=0; i<indices.length; i++) {
            shuffle[indices[i]] = s.charAt(i);
        }


        return new String(shuffle);
        
    }
}