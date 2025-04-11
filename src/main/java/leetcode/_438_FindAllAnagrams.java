package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _438_FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        var answer = new ArrayList<Integer>();
        if (s.length() < p.length()) {
            return answer;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (areArraysEqual(pCount, sCount)) {
                answer.add(i);
            }
            if (i + p.length() < s.length()) {
                sCount[s.charAt(i) - 'a']--;
                sCount[s.charAt(i + p.length()) - 'a']++;
            }
        }
        return answer;
    }

    private boolean areArraysEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
