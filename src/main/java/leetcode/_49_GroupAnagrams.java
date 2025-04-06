package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            map.computeIfAbsent(getAnagramKey(str), s -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String getAnagramKey(String str) {
        char[] key = new char[26];

        for (char c : str.toCharArray()) {
            key[c - 'a']++;
        }
        return new String(key);
    }
}
