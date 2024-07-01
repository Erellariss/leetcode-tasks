package leetcode;

public class _3_LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        int[] windowLetters = new int[257];
        int n = s.length();
        if (n < 2) {
            return n;
        }
        int i = 0, j = 1, max = 0;
        windowLetters[s.charAt(i)]++;
        while (j < n) {
            if (windowLetters[s.charAt(j)] > 0) {
                windowLetters[s.charAt(i++)]--;
            } else {
                windowLetters[s.charAt(j++)]++;
                max = Math.max(max, j - i);
            }
        }
        return max;
    }
}
