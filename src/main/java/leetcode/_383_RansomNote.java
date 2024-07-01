package leetcode;

public class _383_RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int['z' - 'a' + 1];

        for (int i = 0; i < magazine.length(); i++) {
            chars[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            chars[ransomNote.charAt(i) - 'a']--;
        }
        for (int aChar : chars) {
            if (aChar < 0) {
                return false;
            }
        }
        return true;
    }
}
