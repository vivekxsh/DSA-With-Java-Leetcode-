class Trie {

    Trie[] children;
    boolean eow;

    public Trie root;
    public Trie() {
        
        children = new Trie[26];
        eow = false;

        if(root == null) {
            root = this;
        }
    }
    
    
    public void insert(String word) {

        Trie curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Trie();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
        
    }
    
    public boolean search(String word) {

        Trie curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow;
        
    }
    
    public boolean startsWith(String prefix) {

        Trie curr = root;

        for(int level=0; level<prefix.length(); level++){
            int idx = prefix.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */