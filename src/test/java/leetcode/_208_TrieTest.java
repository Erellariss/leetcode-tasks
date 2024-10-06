package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _208_TrieTest {

    @Test
    void case1() {
        var trie = new _208_Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app")); // return True
        trie.insert("app");
        assertTrue(trie.search("app"));     // return True
    }
}