package leetcode;

public class _392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        int charIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(charIndex)) {
                if (++charIndex == s.length())
                    return true;
            }
        }
        return false;
    }
}
