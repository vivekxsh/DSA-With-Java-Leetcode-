class WordDictionary {

    WordDictionary children[];
    boolean eow;

    public WordDictionary root;

    public WordDictionary() {

        children = new WordDictionary[26];
        eow = false;

        if(root == null){
            root = this;
        }
        
    }
    
    public void addWord(String word) {

        WordDictionary curr = root;

        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new WordDictionary();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
        
    }
    
    public boolean search(String word) {

        WordDictionary curr = root;

        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if(word.charAt(level) == '.') {
                for(WordDictionary ch : curr.children) {
                    if(ch != null && ch.search(word.substring(level+1))) return true;
                    
                }
                return false;
            }

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */