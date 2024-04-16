package leetcode;

public class ValidAnagram {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] abc = new int['z' - 'a' + 1];
        for (int i = 0; i < a.length(); i++) {
            abc[a.charAt(i) - 'a']++;
            abc[b.charAt(i) - 'a']--;
        }
        for (int j : abc) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}
