package leetcode;

/*
https://leetcode.com/problems/implement-trie-prefix-tree/description/
https://www.geeksforgeeks.org/trie-insert-and-search/
 */
public class _208_Trie {

    private final TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode pointer = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (pointer.child[c - 'a'] == null) {
                pointer.child[c - 'a'] = new TrieNode();
            }
            pointer = pointer.child[c - 'a'];
        }
        pointer.wordEnd = true;
    }

    public boolean search(String word) {
        TrieNode pointer = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ((pointer = pointer.child[c - 'a']) == null) {
                return false;
            }
        }
        return pointer.wordEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode pointer = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if ((pointer = pointer.child[c - 'a']) == null) {
                return false;
            }
        }
        return true;
    }

    static class TrieNode {
        TrieNode[] child;
        boolean wordEnd;

        public TrieNode() {
            this.child = new TrieNode[26];
            this.wordEnd = false;
        }
    }
}
